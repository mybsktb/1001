<%@ page language="java" 
	contentType="text/html; charset=UTF-8" 
	import="com.mc.dao.*"
	import="java.util.*"
	import="com.mc.dao.impl.*"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String title = request.getParameter("title");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%= basePath%>"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><%=title %></title>
<!-- 		<script type="text/JavaScript" src="resources/ckeditor/ckeditor.js"></script> -->
<!-- 		<script src="//cdn.ckeditor.com/4.5.11/full/ckeditor.js"></script> -->
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
		<%
		IArticleDao artiDao = new ArticleDaoImpl();
		List<Map<String, Object>> results = artiDao.getArticleByTitle(title);
		Map<String,Object> map = results.get(0);
		%>
		<div class="main-body">
			<form action="saveArticle" method="post">
				<p>文章标题<input disabled='disabled' type="text" name="title" class="input-text" value="<%=(String)map.get("title")%>"></p>
				<p>作&nbsp;&nbsp;者<input disabled='disabled' type="text" name="author" class="input-text" value="<%=(String)map.get("author")%>"></p>
				<p>关 键 字<input type="text" disabled='disabled' name="keywords" class="input-text" value="<%=(String)map.get("keywords")%>"></p>
				<p>文章内容</p><hr>
				<div><%=(String)map.get("content")%></div>
<%-- 				<textarea id="TextArea1" disabled='disabled' cols="20" rows="2" class="ckeditor" name="content"> <%=(String)map.get("content")%></textarea> --%>
				<input type="submit" value="提交" style="display:none;">
			</form>
		</div>
	</body>
</html>