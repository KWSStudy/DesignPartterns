package com.kws.javaobserver;

public class positionStation {

	public static void main(String[] args) {
		Position positionData = new Position();
		CurrentDisplay currentDisplay = new CurrentDisplay(positionData);
		positionData.setPosition(121.5f, 25.6f);
		positionData.setPosition(122.5f, 123.6f);
		positionData.setPosition(56.5f, 77.6f);
	}
}
