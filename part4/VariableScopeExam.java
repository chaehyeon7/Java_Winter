package part4;

import javax.xml.bind.JAXBElement.GlobalScope;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticval = 7;
	
	public static void acopeTest(int value) {
		int localScope = 20;
		
//		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
		System.out.println(staticval);//사용가능
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticval);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope= 10;
		v2.globalScope=20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticval = 50; 
		v2.staticval = 100;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		System.out.println(VariableScopeExam.staticval);
	}
}
