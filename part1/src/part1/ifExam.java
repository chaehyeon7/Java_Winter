package part1;

public class ifExam {
	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
//		if(x < y) {
//			System.out.println("x는 y보다 작습니다.");
//		}
		if(x > y) {
			System.out.println("x는 y보다 작습니다.");
		}
		
		int x2 = 50;
		int y2 = 50;
		if(x2 == y2) 
			System.out.println("x는 y와 같습니다.");  //{} 없을때 한줄만 출력가능
		System.out.println("test");
	
		if(x == y) {
			System.out.println("x는 y와 같습니다.");
		}else if(x < y){
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x는 y와 다릅니다.");
		}
	}
}
