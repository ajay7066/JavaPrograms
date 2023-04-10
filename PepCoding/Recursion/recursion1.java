package PepCoding.Recursion;

import java.util.*;

public class recursion1 {

    public static void main(){
        int a = 5;

        fun(a);
        main();
    }

    public static void fun(int a){
        System.out.println("Hello "+a);
        a--;
    }

    public static void main(String[] args) {
        main();

    }
}
