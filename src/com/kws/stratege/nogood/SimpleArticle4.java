package com.kws.stratege.nogood;

import java.util.ArrayList;
import java.util.List;

/*입력, 수정, 삭제 기능이 없는 Article*/
public class SimpleArticle4 extends Article{
	
	public SimpleArticle4() {
		// TODO Auto-generated constructor stub
		System.out.println("입력, 수정, 삭제 기능이 없는 Article");
	}
	
	@Override
	public boolean insertArticle() {
		// TODO Auto-generated method stub
		System.out.println("이건 입력을 하면 안돼");
		return false;
	}
	
	@Override
	public boolean updateArticle() {
		// TODO Auto-generated method stub
		System.out.println("이건 수정 하면 안돼");
		return false;
	}
	
	@Override
	public List selectArticle() {
		// TODO Auto-generated method stub
		System.out.println("Simple4 선택");
		return new ArrayList();
	}
	
	@Override
	public boolean deleteArticle() {
		// TODO Auto-generated method stub
		System.out.println("이건 삭제를 하면 안돼");
		return false;
	}
}
