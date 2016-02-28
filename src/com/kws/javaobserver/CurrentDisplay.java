package com.kws.javaobserver;
import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayPosition{
	private float positionX;
	private float positionY;
	Observable observable;
	
	public CurrentDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("positionX : " + positionX + " positionY :" + positionY);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Position) {
			Position position = (Position)o;
			this.positionX = position.getPositionX();
			this.positionY = position.getPositionY();
			display();
		}
	}
}
