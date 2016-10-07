<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%= basePath%>"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="shortcut icon" type="image/ico" href="resources/images/logo.png">
		<script type="text/javascript" src="resources/js/jquery.js"></script>
		<script type="text/javascript" src="resources/js/ajaxupload.js"></script>
		<script >
			$(function(){
				$("input[name='name']").attr("disabled",true);
				$(".button").click(function(){		
						icon = $("input[name='imgurl']").val();
						$.ajax({
						url:'manager/userUpd',
						data:{"icon":icon},
						success:function(data){
							$("#note").html('');
							if(data=='true'){
								$("#note").append("<img src='${basePath}resources/images/icons/tick_circle.png' /><span>修改成功！</span>");
								$("#note").show().delay(2000).fadeOut("slow");
								}
							else{
								$("#note").append("<img src='${basePath}resources/images/icons/cross_circle.png' /><span>修改失败！</span>");
								$("#note").show();
								}
							}
						});	
				});
				
				//addLabProdPic 上传按钮的id
				new AjaxUpload('#addLabProdPic', {
				//upload 连接到地址为/upload的服务
				action: 'upload', 
				//name: 'picFile',
				//设置返回 格式
				responseType: 'json',
				onSubmit : function(file , ext){
				//正则表达式对上传的文件进行判断
					if (ext && /^(jpg|png|bmp|gif)$/.test(ext.toLowerCase())){
						/* this.setData({
							'picName': file
						}); */
					} else {
						alert("请上传格式为 jpg|png|bmp|gif 的图片！");
						return false;				
					}
				},
				//完成上传之后返回的
				onComplete : function(file,response){
					if(response.error) {
						alert(response.error);
						return;
					}
					//给img标签加src属性，将图片显示出来
					$('#viewImg').attr('src',response.picUrl);
					//将属性赋给input标签下隐藏的imgurl，将路径传到数据库里
					$('#imgurl').attr('value',response.picUrl);
				}
				});
			})
		</script>
	</head>
	<body>
		<!-- <form action="upload" method="post" enctype="multipart/form-data">
			<input type="file" name="file" >
			<input type="submit" value="上传">
		</form> -->
		<form action=""></form>
		<p>
			用户名：${sessionScope.userNm }&nbsp;<a href="logout">注销</a>
		</p>
		<p>
			<img  src="${icon}" id = "viewImg"  style="width: 95px;height: 95px ;border:1px solid gray;" />	
			<input type="hidden"  id="imgurl" name="imgurl" value="${icon}"/>
			<br/>
			<button id="addLabProdPic">更改头像</button>
		</p>
		<p><a href="ckeditor.jsp">添加文章--CKEditor使用</a></p>
	</body>
</html>