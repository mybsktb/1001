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
		<script type="text/javascript" src="resources/js/cropbox.js"></script>
		<script type="text/javascript" src="resources/js/jquery.js"></script>
		<script type="text/javascript">
		$(window).load(function() {
		    var options =
		    {
		        thumbBox: '.thumbBox',
		        spinner: '.spinner',
		        imgSrc: 'avatar.png'
		    }
		    var cropper = $('.imageBox').cropbox(options);
		    $('#file').on('change', function(){
		        var reader = new FileReader();
		        reader.onload = function(e) {
		            options.imgSrc = e.target.result;
		            cropper = $('.imageBox').cropbox(options);
		        }
		        reader.readAsDataURL(this.files[0]);
		        this.files = [];
		    })
		    $('#btnCrop').on('click', function(){
		        var img = cropper.getDataURL()
		        $('.cropped').append('<img src="'+img+'">');
		    })
		    $('#btnZoomIn').on('click', function(){
		        cropper.zoomIn();
		    })
		    $('#btnZoomOut').on('click', function(){
		        cropper.zoomOut();
		    })
		});

		// use with require js (new feature added on 9 Oct 2014)
		require.config({
		    baseUrl: "../",
		    paths: {
		        jquery: 'jquery-1.11.1.min',
		        cropbox: 'cropbox'
		    }
		});
		require( ["jquery", "cropbox"], function($) {
		    var options =
		    {
		        thumbBox: '.thumbBox',
		        spinner: '.spinner',
		        imgSrc: 'avatar.png'
		    }
		    var cropper = $('.imageBox').cropbox(options);
		    $('#file').on('change', function(){
		        var reader = new FileReader();
		        reader.onload = function(e) {
		            options.imgSrc = e.target.result;
		            cropper = $('.imageBox').cropbox(options);
		        }
		        reader.readAsDataURL(this.files[0]);
		        this.files = [];
		    })
		    $('#btnCrop').on('click', function(){
		        var img = cropper.getDataURL();
		        $('.cropped').append('<img src="'+img+'">');
		    })
		    $('#btnZoomIn').on('click', function(){
		        cropper.zoomIn();
		    })
		    $('#btnZoomOut').on('click', function(){
		        cropper.zoomOut();
		    })
		    }
		);
		</script>
	</head>
	<body>
		<div class="container">
    <div class="imageBox">
        <div class="thumbBox"></div>
        <div class="spinner" style="display: none">Loading...</div>
    </div>
    <div class="action">
        <!-- <input type="file" id="file" style=" width: 200px">-->
        <div class="new-contentarea tc">
            <a href="javascript:void(0)" class="upload-img"> <label
                for="upload-file">上传图像</label>
            </a> <input type="file" class="" name="upload-file" id="upload-file" />
        </div>
        <input type="button" id="btnCrop" class="Btnsty_peyton" value="裁切">
            <input type="button" id="btnZoomIn" class="Btnsty_peyton" value=" ">
                <input type="button" id="btnZoomOut" class="Btnsty_peyton"
                value="-">
    </div>
    <div class="cropped"></div>
</div>
	</body>
</html>