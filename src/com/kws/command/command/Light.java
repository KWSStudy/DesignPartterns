package com.kws.command.command;

public class Light{
	
	String area;
	
	public Light(String area) {
		this.area = area;
	}
	
	public void on() {
		System.out.println(area + "light is on");
	}
	
	public void off() {
		System.out.println(area + "light is off");
	}
	
}
