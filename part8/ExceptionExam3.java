package part8;

public class ExceptionExam3 {
	public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
    	int k = divide(i, j);
        System.out.println(k);
        }catch(IllegalAccessException e) {
    	System.out.println(e.toString());
	}
}

    public static int divide(int i, int j) throws IllegalAccessException{
        if(j==0) {
        	throw new IllegalAccessException("0���� ���� �� �����ϴ�. ");
        }
    	int k = i / j;
        return k;
    }
}