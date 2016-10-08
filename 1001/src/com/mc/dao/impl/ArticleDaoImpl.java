package com.mc.dao.impl;

import java.util.List;
import java.util.Map;

import com.mc.dao.IArticleDao;
import com.mc.entity.Article;
import com.mc.utils.JDBCUtil;

public class ArticleDaoImpl implements IArticleDao{

	@Override
	public boolean saveArticle(Article article) {
		if(article==null){
			return false;
		}
		String sql1 = "select * from article where title='"+article.getTitle()+"'";
		List<Map<String,Object>> res = JDBCUtil.doQuery(sql1);
		if(res.size()!=0){
			return false;
		}
		
		String sql = "insert into article(title,author,keywords,content) values ('"
				+ article.getTitle()+"','" + article.getAuthor()+"','"+article.getKeywords()
				+ "','" + article.getContent() + "')";
		return JDBCUtil.doUpdate(sql);
	}

	@Override
	public List<Map<String,Object>> getArticleByTitle(String title) {
		if(title==null){
			return null;
		}
		String sql = "select * from article where title='"+title+"'";
		List<Map<String,Object>> res = JDBCUtil.doQuery(sql);
		return res;
	}

}
