package part4;

public class MyClassExam {
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		int value = myclass.method3();
		System.out.println("리턴한 값" + value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한 값은 " +value2);
	}
}
