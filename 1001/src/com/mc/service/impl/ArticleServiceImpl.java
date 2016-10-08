package com.mc.service.impl;

import com.mc.dao.IArticleDao;
import com.mc.dao.impl.ArticleDaoImpl;
import com.mc.entity.Article;
import com.mc.service.IArticleService;

public class ArticleServiceImpl implements IArticleService {

	@Override
	public boolean saveArticle(Article article) {
		if(article==null){
			return false;
		}
		IArticleDao arti = new ArticleDaoImpl();
		return arti.saveArticle(article);
	}

}
