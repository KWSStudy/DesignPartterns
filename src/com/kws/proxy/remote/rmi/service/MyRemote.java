package com.kws.proxy.remote.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	public String syaHello() throws RemoteException;
}
