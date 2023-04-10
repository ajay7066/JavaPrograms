package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class Throw {

    public static void DivideByZero(){
//        File newFile = new File("text.txt");
        throw new  ArithmeticException("Trying to divide by 0");
    }


    public static void main(String[] args) {
        DivideByZero();
    }
}
