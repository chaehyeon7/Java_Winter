package part8;

public class ExceptionExam {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = 1/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�." +e.toString());
		}finally {
			System.out.println("������ �߻��ߵ� ������ ������ ���");
		}
		System.out.println("main end!!");
	}
}
