package com.kws.command;

import com.kws.command.command.Light;
import com.kws.command.remote.RemoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
	
		//기본테스트 
//		SimpleRemoteControl remote = new SimpleRemoteControl();
//		Light light = new Light();
//		GarageDoor garageDoor = new GarageDoor();
//		LightOnCommand lightOn = new LightOnCommand(light);
//		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//		
//		remote.setCommand(lightOn);
//		remote.buttonWasPressed();
//		remote.setCommand(garageOpen);
//		remote.buttonWasPressed();
		
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");

	}

}
