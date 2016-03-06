package com.kws.stratege.nogood;

import java.util.ArrayList;
import java.util.List;

public class SimpleArticle2 extends Article{
	
	public SimpleArticle2() {
		// TODO Auto-generated constructor stub
		System.out.println("모든것이 다되는 SimpleArticle2");
	}
	
	@Override
	public List selectArticle() {
		// TODO Auto-generated method stub
		System.out.println("Simple2 선택");
		return new ArrayList();
	}
}
