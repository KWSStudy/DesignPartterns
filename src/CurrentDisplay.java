
public class CurrentDisplay implements Observer, DisplayPosition{
	private float positionX;
	private float positionY;
	private Subject positionData;
	
	public CurrentDisplay(Subject positionData) {
		this.positionData = positionData;
		positionData.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("positionX : " + positionX + " positionY :" + positionY);
	}

	@Override
	public void update(float positionX, float positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		display();
	}
}
