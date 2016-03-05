package com.kws.singleton;

public class SingletonWithDCL {
	private volatile static SingletonWithDCL uniqueInstance;
	private int a = 0;
	
	private SingletonWithDCL(){}
	
	public static synchronized SingletonWithDCL getInstance(){
		if(uniqueInstance == null){
			synchronized (SingletonWithDCL.class) {
				if(uniqueInstance == null){
					uniqueInstance = new SingletonWithDCL();
				}
			}
		}
		return uniqueInstance;
	}
	
	public int getA(){
		System.out.println("DCL 싱글톤 일경우 ");
		System.out.println(hashCode());
		return a++;
	}
}
