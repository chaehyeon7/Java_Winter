package part1;

public class ifExam {
	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
//		if(x < y) {
//			System.out.println("x�� y���� �۽��ϴ�.");
//		}
		if(x > y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}
		
		int x2 = 50;
		int y2 = 50;
		if(x2 == y2) 
			System.out.println("x�� y�� �����ϴ�.");  //{} ������ ���ٸ� ��°���
		System.out.println("test");
	
		if(x == y) {
			System.out.println("x�� y�� �����ϴ�.");
		}else if(x < y){
			System.out.println("x�� y���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}
	}
}
