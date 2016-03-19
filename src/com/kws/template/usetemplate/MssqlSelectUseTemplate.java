package com.kws.template.usetemplate;

public class MssqlSelectUseTemplate extends DBSelectTemplate{

	@Override
	void executeQuery(String query) {
		// TODO Auto-generated method stub
		System.out.println("Mssql ==> " + query);
	}

}
