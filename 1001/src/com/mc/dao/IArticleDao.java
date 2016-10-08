package com.mc.dao;

import java.util.List;
import java.util.Map;

import com.mc.entity.Article;

public interface IArticleDao {
	public boolean saveArticle(Article article);
	
	public List<Map<String,Object>> getArticleByTitle(String title);
}
