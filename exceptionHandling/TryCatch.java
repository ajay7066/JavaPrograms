package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {

        int n = 5;
        EH(n);
    }

    public static void EH(int n){
        try{
            int n1 = n/0;
            System.out.println(n1);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException =>" + e.getMessage());
        }
        finally{
            System.out.println("finally executed  ");
        }
    }
}
