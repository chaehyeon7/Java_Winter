package part6;

public class Truck extends Car {
	public Truck() {
		super("소방차");  //부모의 생성자를 가리킴
		System.out.println("Truck의 기본생성자 입니다.");
	}
}
