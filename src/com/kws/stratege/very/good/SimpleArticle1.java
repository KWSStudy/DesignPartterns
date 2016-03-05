package com.kws.stratege.very.good;

import java.util.ArrayList;
import java.util.List;

public class SimpleArticle1 extends Article{
	public SimpleArticle1() {
		// TODO Auto-generated constructor stub
		System.out.println("모든것이 다되는 SimpleArticle1");
	}
	
	@Override
	public List selectArticle() {
		// TODO Auto-generated method stub
		System.out.println("Simple1 선택");
		return new ArrayList();
	}
}
