package part7;

public class LedTV implements Tv {  //tv��� �������̽��� ����, ����ϰڴ� ��

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("����");   
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(" ���������ϴ�.");
	}

	@Override
	public void changeCHannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("ä�������ϴ�.");
	}

}
