package part7;

public class LedExam {
	public static void main(String[] args) {
		Tv tv = new LedTV();
		tv.turnOn();
		tv.changeCHannel(8);
		tv.changeVolume(39);
		tv.trunOff();
	}
}
