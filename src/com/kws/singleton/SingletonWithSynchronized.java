package com.kws.singleton;

public class SingletonWithSynchronized {
	private static SingletonWithSynchronized uniqueInstance;
	private int a = 0;
	
	private SingletonWithSynchronized(){}
	
	public static synchronized SingletonWithSynchronized getInstance(){
		if(uniqueInstance == null) uniqueInstance = new SingletonWithSynchronized();
		return uniqueInstance;
	}
	
	public int getA(){
		System.out.println("동기화 싱글톤 일경우 ");
		System.out.println(hashCode());
		return a++;
	}
}
