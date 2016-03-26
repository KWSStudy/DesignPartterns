package com.kws.proxy.remote.gumball.client;

import java.rmi.Naming;

import com.kws.proxy.remote.gumball.service.GumballMachineRemote;



public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		String location [] = {
				"rmi://127.0.0.1/seattle.mig.com/gumballmachine"
		};
		
		GumballMonitor [] monitors = new GumballMonitor[location.length];
		for(int i = 0 ; i < location.length ; i ++){
			try{
				GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup(location[i]);
				monitors[i] = new GumballMonitor(remote);
				System.out.println(monitors[i]);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		for(int i = 0 ; i < location.length ; i ++){
			monitors[i].report();
		}
	}
}
