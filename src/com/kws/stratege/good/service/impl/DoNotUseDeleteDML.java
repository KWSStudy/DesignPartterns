package com.kws.stratege.good.service.impl;

import com.kws.stratege.good.service.ArticleDML;

public class DoNotUseDeleteDML implements ArticleDML{

	@Override
	public boolean insertArticle() {
		// TODO Auto-generated method stub
		System.out.println("입력한다");
		return true;
	}

	@Override
	public boolean updateArticle() {
		// TODO Auto-generated method stub
		System.out.println("수정한다");
		return true;
	}

	@Override
	public boolean deleteArticle() {
		// TODO Auto-generated method stub
		System.out.println("삭제 못 한다");
		return false;
	}

}
