package com.kws.stratege.good.service.impl;

import com.kws.stratege.good.service.ArticleDML;

public class DoNotUseAllDML implements ArticleDML{

	@Override
	public boolean insertArticle() {
		// TODO Auto-generated method stub
		System.out.println("입력 못 한다");
		return false;
	}

	@Override
	public boolean updateArticle() {
		// TODO Auto-generated method stub
		System.out.println("수정 못 한다");
		return false;
	}

	@Override
	public boolean deleteArticle() {
		// TODO Auto-generated method stub
		System.out.println("삭제 못 한다");
		return false;
	}

}
