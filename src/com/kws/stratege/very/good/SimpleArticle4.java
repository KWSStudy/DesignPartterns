package com.kws.stratege.very.good;

import java.util.ArrayList;
import java.util.List;

import com.kws.stratege.good.service.impl.DoNotUseAllDML;

/*입력, 수정, 삭제 기능이 없는 Article*/
public class SimpleArticle4 extends Article{
	
	public SimpleArticle4() {
		// TODO Auto-generated constructor stub
		System.out.println("입력, 수정, 삭제 기능이 없는 Article");
	}
	
	@Override
	public List selectArticle() {
		// TODO Auto-generated method stub
		System.out.println("Simple4 선택");
		return new ArrayList();
	}
	
}
