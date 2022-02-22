
public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i<= 100; i++) {  //100가지의 합
//			if(i %2 != 0) { //작수의 합
//				continue;
//			}
			
			total = total + i;
			if(i == 50){
				break;
			}
		}
		
		System.out.println(total);

	}

}
