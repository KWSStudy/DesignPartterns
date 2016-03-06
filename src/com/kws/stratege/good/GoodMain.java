package com.kws.stratege.good;

public class GoodMain {
	public static void main(String[] args) {
		SimpleArticle1 article1 = new SimpleArticle1();
		article1.insertArticle();
		article1.selectArticle();
		article1.updateArticle();
		article1.deleteArticle();
		System.out.println();
		SimpleArticle2 article2 = new SimpleArticle2();
		article2.insertArticle();
		article2.selectArticle();
		article2.updateArticle();
		article2.deleteArticle();
		System.out.println();
		SimpleArticle3 article3 = new SimpleArticle3();
		article3.insertArticle();
		article3.selectArticle();
		article3.updateArticle();
		article3.deleteArticle();
		System.out.println();
		SimpleArticle4 article4 = new SimpleArticle4();
		article4.insertArticle();
		article4.selectArticle();
		article4.updateArticle();
		article4.deleteArticle();
	}
}
