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
<!-- 		<script type="text/JavaScript" src="resources\ckeditor\ckeditor.js"></script> -->
		<script src="//cdn.ckeditor.com/4.5.11/full/ckeditor.js"></script>
<!-- 		<script src="//cdn.ckeditor.com/4.5.11/standard/ckeditor.js"></script> -->
	</head>
	<body>
		<form action="">
			文章标题<input type="text">
			
			<textarea id="TextArea1" cols="20" rows="2" class="ckeditor"></textarea>
		</form>
	</body>
</html>