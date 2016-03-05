package com.kws.stratege.nogood;

import java.util.ArrayList;
import java.util.List;

/*삭제 기능이 없는 Article*/
public class SimpleArticle3 extends Article{
	
	public SimpleArticle3() {
		// TODO Auto-generated constructor stub
		System.out.println("삭제 기능이 없는 Article");
	}
	
	@Override
	public List selectArticle() {
		// TODO Auto-generated method stub
		System.out.println("Simple3 선택");
		return new ArrayList();
	}
	
	@Override
	public boolean deleteArticle() {
		// TODO Auto-generated method stub
		System.out.println("이건 삭제를 하면 안돼");
		return false;
	}
}
