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
		// ��ʼ��·��
		// �����ļ���Ŀ¼
		path = servletCtx.getRealPath("/resources/upload/images/");
		//�洢�ļ��в����ڵ�ʱ�򴴽��洢�ļ���
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
        //��ô����ļ���Ŀ����  
        DiskFileItemFactory factory = new DiskFileItemFactory();  
        //��ȡ�ļ���Ҫ�ϴ�����·��  
//        String path = request.getSession().getServletContext().getRealPath("/resources/upload/images/");
        logger.debug(path);
        factory.setRepository(new File(path));
        //���� ����Ĵ�С�����ϴ��ļ������������û���ʱ��ֱ�ӷŵ� ��ʱ�洢�� 
        factory.setSizeThreshold(5*1024*1024);
        //��ˮƽ��API�ļ��ϴ�����  
        ServletFileUpload upload = new ServletFileUpload(factory); 
        try {  
            //�����ϴ�����ļ�  
            List<FileItem> list = (List<FileItem>)upload.parseRequest(request);  
            
            for(FileItem item : list)  
            {
            	if(!item.isFormField()){
            		//��ȡ������������  
            		String name = item.getFieldName();
            		logger.debug("name: "+name);
            		
            		/** 
            		 * ������������Ҫ��ȡ �ϴ��ļ������� 
            		 */  
            		//��ȡ·����  
            		String value = item.getName() ; 
            		logger.debug("value: "+value);
            		
            		//���������һ����б��  
            		int start = value.lastIndexOf("\\");  
            		//��ȡ �ϴ��ļ��� �ַ������֣���1�� ȥ����б�ܣ�  
            		String filename = value.substring(start+1);  
            		logger.debug("filename:"+filename);
            		
            		// ͼƬ�洢��
            		String saveName = new Date().getTime()+filename.substring(filename.indexOf("."));
            		logger.debug("ͼƬ�洢��:"+saveName);
        			// �����ͼƬ�����������·��
        			String picUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/resources/upload/images/"+saveName;
        			logger.debug("ͼƬ�����������·��:"+picUrl);
            		
        			User user = new User();
        			user.setIcon(picUrl);
        			user.setUsername((String)request.getSession().getAttribute("userNm"));
        			
        			ILoginService loginService = new LoginServiceImpl();
        			if(loginService.changeIcon(user)){
        				logger.debug("ͷ����ĳɹ���");
        			} else {
        				logger.debug("ͷ�����ʧ�ܣ�����");
        			}
        			request.getSession().setAttribute("icon", picUrl);
        			
        			item.write(new File(path,saveName));
        			
        			PrintWriter writer = response.getWriter();
        			
        			writer.print("{");
        			writer.print("msg:\"�ļ���С:"+item.getSize()+",�ļ���:"+filename+"\"");
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
