package com.kws.template.usetemplate;

public class MysqlSelectUseTemplate extends DBSelectTemplate{

	@Override
	void executeQuery(String query) {
		// TODO Auto-generated method stub
		System.out.println("Mysql ==> " + query);
	}

}
