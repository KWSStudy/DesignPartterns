package com.kws.proxy.remote.gumball.client;

import java.rmi.RemoteException;

import com.kws.proxy.remote.gumball.service.GumballMachineRemote;



public class GumballMonitor {
	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	public void report(){
		try{
			System.out.println("기계 위치 : " + machine.getLocation());
			System.out.println("현재 재고 : " + machine.getCount());
			System.out.println("현재 상태 : " + machine.getState());
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
}
