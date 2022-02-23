package part7;

public interface Tv {
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void trunOff();
	public void changeVolume(int volume);
	public void changeCHannel(int channel);
}
