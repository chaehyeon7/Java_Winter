package part6;

public class BusExam {
	public static void main(String[] args) {
//		Bus bus = new Bus();
//		bus.run();
//		bus.ppangppang();
//		
//		Car car = new Car();
//		car.run();
		
//		car.ppangppang();   사용 불가
		
		Car c = new Bus();
		c.run();
//		c.ppangppang(); //오류:부모 타입으로 자식을 가리킬 수 있다. 이경우 부모가 가지고 있는 내용만 사용 가능
		
		Bus bus = (Bus)c;  //클래스 형변환
		bus.run();
		bus.ppangppang();
	}
}
