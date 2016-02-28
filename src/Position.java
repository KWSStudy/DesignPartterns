import java.util.ArrayList;

public class Position implements Subject{
	private ArrayList<Observer> observers;
	private float positionX;
	private float positionY;
	
	public Position() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notiObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(positionX, positionX);
		}
	}
	
	public float getPositionX() {
		return positionX;
	}
	
	public float getPositionY() {
		return positionY;
	}
	public void positionChanged(){
		notiObserver();
	}
	
	public void setPosition(float positionX, float positionY){
		this.positionX = positionX;
		this.positionY = positionY;
		positionChanged();
	}
	
	//기타메서드
}
