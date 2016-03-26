package com.kws.proxy.remote.gumball.server;

import java.rmi.Naming;

import com.kws.proxy.remote.gumball.service.GumballMachineRemote;

// 테스트용 코드
@SuppressWarnings("ALL")
public class GumballMachineTestDrive {

  public static void main(String[] args) {
	  GumballMachineRemote remote = null;
    int count = 0;
    
    if(args.length < 2){
    	System.out.println("GumballMachine <name> <inventory>");
    	System.exit(1);
    }
    
    count = Integer.parseInt(args[1]);
	try {
		remote = new GumballMachine(args[0], count);
		System.out.println("/"+args[0]+"/gumballmachine");
		Naming.rebind("/"+args[0]+"/gumballmachine", remote);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
