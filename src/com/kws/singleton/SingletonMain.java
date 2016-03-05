package com.kws.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		SingletonThread singletonThread1 = new SingletonThread();
		SingletonThread singletonThread2 = new SingletonThread();
		singletonThread1.start();
		singletonThread2.start();

		SingletonThreadSynchronized singletonThreadSynchronized1 = new SingletonThreadSynchronized();
		SingletonThreadSynchronized singletonThreadSynchronized2 = new SingletonThreadSynchronized();
		singletonThreadSynchronized1.start();
		singletonThreadSynchronized2.start();

		SingletonThreadDCL singletonThreadDCL1 = new SingletonThreadDCL();
		SingletonThreadDCL singletonThreadDCL2 = new SingletonThreadDCL();
		singletonThreadDCL1.start();
		singletonThreadDCL2.start();
	}
}
