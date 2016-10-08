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
<!-- 		<script type="text/JavaScript" src="resources/ckeditor/ckeditor.js"></script> -->
		<script src="//cdn.ckeditor.com/4.5.11/full/ckeditor.js"></script>
<!-- 		<script src="//cdn.ckeditor.com/4.5.11/standard/ckeditor.js"></script> -->
		<style type="text/css">
			.main-body{
				width:80%;
				margin:0px auto;
			}
			.input-text{
				margin-left:10px;
				border-radius:5px;
			}
		</style>
	</head>
	<body>
		<div class="main-body">
			<form action="saveArticle" method="post">
				<p>文章标题<input type="text" name="title" class="input-text"></p>
				<p>作&nbsp;&nbsp;者<input type="text" name="author" class="input-text"></p>
				<p>关 键 字<input type="text" name="keywords" class="input-text"></p>
				<p>文章内容</p>
				<textarea id="TextArea1" cols="20" rows="2" class="ckeditor" name="content"></textarea>
				<input type="submit" value="提交">
			</form>
		</div>
	</body>
</html>