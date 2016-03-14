package com.kws.command.command;

public class GarageDoor {
	
	String area;
	
	public GarageDoor(String area) {
		this.area = area;
	}

	public void up() {
		System.out.println(area + "Garage Door is open");
	}
	
	public void down() {
		System.out.println(area + "Garage Door is close");
	}
	
	public void stop() {
		System.out.println(area + "Garage Door is stop");
	}
	
	public void lightOn() {
		System.out.println(area + "Garage Door is light on");
	}
	
	public void lightOff() {
		System.out.println(area + "Garage Door is light off");
	}
}
