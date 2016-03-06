package com.kws.singleton;

public class SingletonThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getA());
	}
}
