package com.kws.singleton;

public class SingletonThreadSynchronized extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingletonWithSynchronized singleton = SingletonWithSynchronized.getInstance();
		System.out.println(singleton.getA());
	}
}
