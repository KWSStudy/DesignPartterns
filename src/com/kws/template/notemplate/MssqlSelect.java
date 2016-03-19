package com.kws.template.notemplate;

public class MssqlSelect {
	public void getSelect(){
		try{
			System.out.println("Mssql Driver Loading");
		}catch(Exception e){
			System.out.println("Mssql Driver Loading Exception");
		}
		
		try{
			System.out.println("Mssql getConnection");
			System.out.println("Mssql createStatement");
			System.out.println("Mssql executeQuery");
		}catch(Exception e){
			System.out.println("Mssql Exception");
		}finally{
			System.out.println("Mssql Resource Close");
		}
	}
}
