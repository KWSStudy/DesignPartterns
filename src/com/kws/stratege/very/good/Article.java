package com.kws.stratege.very.good;

import java.util.List;

import com.kws.stratege.good.service.ArticleDML;

public abstract class Article {
	
	private ArticleDML articleDML;
	
	protected void setArticleDML(ArticleDML articleDML){
		this.articleDML = articleDML;
	}
	
	public boolean insertArticle(){
		return articleDML.insertArticle();
	}
	public boolean updateArticle(){  
		return articleDML.updateArticle();
	}
	public boolean deleteArticle(){
		return articleDML.deleteArticle();
	}
	
	public abstract List selectArticle();
	
}
