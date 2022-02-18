package part1;

public class OperatorExam {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3;  //i3 = i3+1;  먼저 계산
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; // i3 = i3 + 1;  값을 대입후 증가
		System.out.println(i5);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
	}
}
