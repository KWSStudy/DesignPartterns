package com.kws.proxy.remote.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.kws.proxy.remote.rmi.service.MyRemote;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	
	public MyRemoteImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String syaHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Server Say, `Hey`";
	}
	
	public static void main(String[] args) {
		try {
			MyRemote myRemote = new MyRemoteImpl();
			Naming.rebind("RemoteHello", myRemote);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
