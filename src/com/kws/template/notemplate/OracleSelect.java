package com.kws.template.notemplate;

public class OracleSelect {
	public void getSelect(){
		try{
			System.out.println("Oracle Driver Loading");
		}catch(Exception e){
			System.out.println("Oracle Driver Loading Exception");
		}
		
		try{
			System.out.println("Oracle getConnection");
			System.out.println("Oracle createStatement");
			System.out.println("Oracle executeQuery");
		}catch(Exception e){
			System.out.println("Oracle Exception");
		}finally{
			System.out.println("Oracle Resource Close");
		}
	}
}
