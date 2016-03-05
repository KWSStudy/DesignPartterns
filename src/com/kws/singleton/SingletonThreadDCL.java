package com.kws.singleton;

public class SingletonThreadDCL extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingletonWithDCL singleton = SingletonWithDCL.getInstance();
		System.out.println(singleton.getA());
	}
}
