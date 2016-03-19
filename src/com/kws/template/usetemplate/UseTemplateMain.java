package com.kws.template.usetemplate;

public class UseTemplateMain {
	public static void main(String[] args) {
		OracleSelectUseTemplate oracleSelect = new OracleSelectUseTemplate();
		oracleSelect.getSelect("Oracle","SELECT * FROM DUAL");
		System.out.println("========================================");
		MysqlSelectUseTemplate mysqlSelect = new MysqlSelectUseTemplate();
		mysqlSelect.getSelect("Mysql","SELECT * FROM DUAL");
		System.out.println("========================================");
		MssqlSelectUseTemplate mssqlSelect = new MssqlSelectUseTemplate();
		mssqlSelect.getSelect("Mssql","SELECT * FROM DUAL");
	}
}
