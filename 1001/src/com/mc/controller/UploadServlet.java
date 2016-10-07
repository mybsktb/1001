package com.mc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import com.mc.entity.User;
import com.mc.service.ILoginService;
import com.mc.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class UploadServlet
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(UploadServlet.class);
	private static String path = "/";
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ServletContext servletCtx = config.getServletContext();
		// 初始化路径
		// 保存文件的目录
		path = servletCtx.getRealPath("/resources/upload/images/");
		//存储文件夹不存在的时候创建存储文件夹
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
        //获得磁盘文件条目工厂  
        DiskFileItemFactory factory = new DiskFileItemFactory();  
        //获取文件需要上传到的路径  
//        String path = request.getSession().getServletContext().getRealPath("/resources/upload/images/");
        logger.debug(path);
        factory.setRepository(new File(path));
        //设置 缓存的大小，当上传文件的容量超过该缓存时，直接放到 暂时存储室 
        factory.setSizeThreshold(5*1024*1024);
        //高水平的API文件上传处理  
        ServletFileUpload upload = new ServletFileUpload(factory); 
        try {  
            //可以上传多个文件  
            List<FileItem> list = (List<FileItem>)upload.parseRequest(request);  
            
            for(FileItem item : list)  
            {
            	if(!item.isFormField()){
            		//获取表单的属性名字  
            		String name = item.getFieldName();
            		logger.debug("name: "+name);
            		
            		/** 
            		 * 以下三步，主要获取 上传文件的名字 
            		 */  
            		//获取路径名  
            		String value = item.getName() ; 
            		logger.debug("value: "+value);
            		
            		//索引到最后一个反斜杠  
            		int start = value.lastIndexOf("\\");  
            		//截取 上传文件的 字符串名字，加1是 去掉反斜杠，  
            		String filename = value.substring(start+1);  
            		logger.debug("filename:"+filename);
            		
            		// 图片存储名
            		String saveName = new Date().getTime()+filename.substring(filename.indexOf("."));
            		logger.debug("图片存储名:"+saveName);
        			// 保存后图片的浏览器访问路径
        			String picUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/resources/upload/images/"+saveName;
        			logger.debug("图片的浏览器访问路径:"+picUrl);
            		
        			User user = new User();
        			user.setIcon(picUrl);
        			user.setUsername((String)request.getSession().getAttribute("userNm"));
        			
        			ILoginService loginService = new LoginServiceImpl();
        			if(loginService.changeIcon(user)){
        				logger.debug("头像更改成功！");
        			} else {
        				logger.debug("头像更改失败！！！");
        			}
        			request.getSession().setAttribute("icon", picUrl);
        			
        			item.write(new File(path,saveName));
        			
        			PrintWriter writer = response.getWriter();
        			
        			writer.print("{");
        			writer.print("msg:\"文件大小:"+item.getSize()+",文件名:"+filename+"\"");
        			writer.print(",picUrl:\"" + picUrl + "\"");
        			writer.print("}");
        			
        			writer.close();
            	}
            }  
        } catch (FileUploadException e) {
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (Exception e) {
            // TODO Auto-generated catch block  
              
            //e.printStackTrace();  
        }
        
	}

}
