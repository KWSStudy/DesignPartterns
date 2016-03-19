package com.kws.template.usetemplate;

public abstract class DBSelectTemplate {

	//템플릿으로 사용될 부분
	final void getSelect(String dbName,String query){
		try{
			driverLoading(dbName);
		}catch(Exception e){
			System.out.println(dbName + " Driver Loading Exception");
		}
		
		try{
			getConnection(dbName);
			createStatement(dbName);
			executeQuery(query);
		}catch(Exception e){
			System.out.println(dbName + " Exception");
		}finally{
			resourceClose(dbName);
		}
	}
	
	//1.DB드라이버를 로딩한다.
	final void driverLoading(String dbName){
		System.out.println(dbName + " Driver Loading");
	}
	
	//2.커넥션을 가져온다.
	final void getConnection(String dbName){
		System.out.println(dbName + " getConnection");
	}
	//3.statement을 생성한다.
	final void createStatement(String dbName){
		System.out.println(dbName + " createStatement");
	}
	//4.select 쿼리를 날린다.
	abstract void executeQuery(String query);
	
	//5.리소스를 close한다.
	final void resourceClose(String dbName){
		System.out.println(dbName + " Resource Close");
	}
}
