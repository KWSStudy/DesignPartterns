package com.kws.template.notemplate;

public class NoTemplateMain {
	public static void main(String[] args) {
		OracleSelect oracleSelect = new OracleSelect();
		oracleSelect.getSelect();
		System.out.println("========================================");
		MysqlSelect mysqlSelect = new MysqlSelect();
		mysqlSelect.getSelect();
		System.out.println("========================================");
		MssqlSelect mssqlSelect = new MssqlSelect();
		mssqlSelect.getSelect();
	}
}
