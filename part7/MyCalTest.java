package part7;

public class MyCalTest {
	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		cal.exec(3, 5);
		int i = cal.exec(3, 5);
		
		Calculator.exec2(1, 4);
	}
}
