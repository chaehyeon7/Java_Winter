package part6;

public class BusExam {
	public static void main(String[] args) {
//		Bus bus = new Bus();
//		bus.run();
//		bus.ppangppang();
//		
//		Car car = new Car();
//		car.run();
		
//		car.ppangppang();   ��� �Ұ�
		
		Car c = new Bus();
		c.run();
//		c.ppangppang(); //����:�θ� Ÿ������ �ڽ��� ����ų �� �ִ�. �̰�� �θ� ������ �ִ� ���븸 ��� ����
		
		Bus bus = (Bus)c;  //Ŭ���� ����ȯ
		bus.run();
		bus.ppangppang();
	}
}
