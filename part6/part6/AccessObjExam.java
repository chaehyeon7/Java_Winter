package part6;

public class AccessObjExam extends AccessOBj{
    public static void main(String args[]){
        AccessOBj obj = new AccessOBj();
        System.out.println(obj.p); 
        System.out.println(obj.p2); 
        System.out.println(obj.k);
        System.out.println(obj.i); //private이라 사용 못함
    }
}