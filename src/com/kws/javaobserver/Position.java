package com.kws.javaobserver;
import java.util.Observable;

public class Position extends Observable{
	private float positionX;
	private float positionY;
	
	public float getPositionX() {
		return positionX;
	}
	
	public float getPositionY() {
		return positionY;
	}
	public void positionChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setPosition(float positionX, float positionY){
		this.positionX = positionX;
		this.positionY = positionY;
		positionChanged();
	}
	
	//기타메서드
}
