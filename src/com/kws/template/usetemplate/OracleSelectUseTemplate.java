package com.kws.template.usetemplate;

public class OracleSelectUseTemplate extends DBSelectTemplate{

	@Override
	void executeQuery(String query) {
		// TODO Auto-generated method stub
		System.out.println("ORACLE ==> " + query);
	}

}
