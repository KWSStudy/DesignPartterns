package com.kws.stratege.good;

import java.util.ArrayList;
import java.util.List;

import com.kws.stratege.good.service.ArticleDML;
import com.kws.stratege.good.service.impl.AllUseDML;

public class Article {
	
	ArticleDML articleDML;
	
	public Article() {
		// TODO Auto-generated constructor stub
		articleDML = new AllUseDML();
	}
	
	public boolean insertArticle(){
		return articleDML.insertArticle();
	}
	public List selectArticle(){
		System.out.println("선택 되었다.");
		return new ArrayList();
	}
	public boolean updateArticle(){
		return articleDML.updateArticle();
	}
	public boolean deleteArticle(){
		return articleDML.deleteArticle();
	}
}
