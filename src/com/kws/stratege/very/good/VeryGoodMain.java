package com.kws.stratege.very.good;

import com.kws.stratege.good.service.impl.AllUseDML;
import com.kws.stratege.good.service.impl.DoNotUseAllDML;
import com.kws.stratege.good.service.impl.DoNotUseDeleteDML;

public class VeryGoodMain {
	public static void main(String[] args) {
		SimpleArticle1 article1 = new SimpleArticle1();
		article1.setArticleDML(new AllUseDML());
		article1.insertArticle();
		article1.selectArticle();
		article1.updateArticle();
		article1.deleteArticle();
		System.out.println();
		SimpleArticle2 article2 = new SimpleArticle2();
		article2.setArticleDML(new AllUseDML());
		article2.insertArticle();
		article2.selectArticle();
		article2.updateArticle();
		article2.deleteArticle();
		System.out.println();
		SimpleArticle3 article3 = new SimpleArticle3();
		article3.setArticleDML(new DoNotUseDeleteDML());
		article3.insertArticle();
		article3.selectArticle();
		article3.updateArticle();
		article3.deleteArticle();
		System.out.println();
		SimpleArticle4 article4 = new SimpleArticle4();
		article4.setArticleDML(new DoNotUseAllDML());
		article4.insertArticle();
		article4.selectArticle();
		article4.updateArticle();
		article4.deleteArticle();
	}
}
