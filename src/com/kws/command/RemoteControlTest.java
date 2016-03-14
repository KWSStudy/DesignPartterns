package com.kws.command;

import com.kws.command.command.GarageDoor;
import com.kws.command.command.GarageDoorCloseCommand;
import com.kws.command.command.GarageDoorOpenCommand;
import com.kws.command.command.Light;
import com.kws.command.command.LightOffCommand;
import com.kws.command.command.LightOnCommand;
import com.kws.command.command.Stereo;
import com.kws.command.command.StereoOffWithCDCommand;
import com.kws.command.command.StereoOnWithCDCommand;
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
		Light kitchenLight = new Light("kitchen Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
		
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}

}
