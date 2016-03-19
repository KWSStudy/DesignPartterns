package com.kws.template.notemplate;

public class MysqlSelect {
	public void getSelect(){
		try{
			System.out.println("Mysql Driver Loading");
		}catch(Exception e){
			System.out.println("Mysql Driver Loading Exception");
		}
		
		try{
			System.out.println("Mysql getConnection");
			System.out.println("Mysql createStatement");
			System.out.println("Mysql executeQuery");
		}catch(Exception e){
			System.out.println("Mysql Exception");
		}finally{
			System.out.println("Mysql Resource Close");
		}
	}
}
