package PepCoding.Recursion;

import java.util.*;

public class printIncreasing {

    public static void printIncreas(int n ){
        if(n==0){
            return;
        }
        printIncreas(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter he number : ");
        int n = sc.nextInt();

        printIncreas(n);
    }
}
