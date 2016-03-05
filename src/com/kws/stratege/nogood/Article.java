package com.kws.stratege.nogood;

import java.util.ArrayList;
import java.util.List;

public class Article {
	public boolean insertArticle(){
		System.out.println("입력 되었다.");
		return true;
	}
	public List selectArticle(){
		System.out.println("선택 되었다.");
		return new ArrayList();
	}
	public boolean updateArticle(){
		System.out.println("수정 되었다.");
		return true;
	}
	public boolean deleteArticle(){
		System.out.println("삭제 되었다.");
		return true;
	}
}
