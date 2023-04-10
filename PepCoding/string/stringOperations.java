package PepCoding.string;

public class stringOperations {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");

//        if(s1.equals(s4)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }


        s1+=" world";

//        System.out.println(s1);

        System.out.println(s1.substring(2,7));
    }
}
