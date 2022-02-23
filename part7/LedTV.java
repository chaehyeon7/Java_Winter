package part7;

public class LedTV implements Tv {  //tv라는 인터페이스를 구형, 사용하겠단 의

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");   
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(" 볼륨조정하다.");
	}

	@Override
	public void changeCHannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널조정하다.");
	}

}
