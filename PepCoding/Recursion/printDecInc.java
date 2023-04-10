package PepCoding.Recursion;

import java.util.Scanner;

public class printDecInc {
    public static void printIncDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
//        System.out.println("Increasing numbers : ");
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printIncDec(n);
    }
}
