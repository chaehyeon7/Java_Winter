package part3;

public class ArrayExam {
	public static void main(String[] args) {
		int[] array1 = new int[100]; //방법1
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4}; //방법2
		
		int[] array3 = {1,2,3,4};  //방법3 (1차원 배열)
		
		System.out.println(array3[3]);  //배열 꺼내기
		
		int value = array3[0];  //0번째 배열 꺼내달라.
		
		System.out.println(value);  //갑을 차례대로 꺼내기
		
		
		
		
	}
}
