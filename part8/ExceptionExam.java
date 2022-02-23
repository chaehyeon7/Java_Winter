package part8;

public class ExceptionExam {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = 1/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다." +e.toString());
		}finally {
			System.out.println("오류가 발생했든 안했은 무조건 출력");
		}
		System.out.println("main end!!");
	}
}
