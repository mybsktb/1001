package com.mc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mc.entity.Article;
import com.mc.service.IArticleService;
import com.mc.service.impl.ArticleServiceImpl;

public class ArticleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(ArticleServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String keywords = req.getParameter("keywords");
		String content = req.getParameter("content");
		
		Article arti = new Article();
		arti.setTitle(title);
		arti.setAuthor(author);
		arti.setKeywords(keywords);
		arti.setContent(content);
		
		IArticleService articleService = new ArticleServiceImpl();
		boolean result = articleService.saveArticle(arti);
		if(result){
			logger.debug("保存成功！");
			req.getRequestDispatcher("showArticle.jsp?title="+title).forward(req, resp);
		}
	}
	
}
