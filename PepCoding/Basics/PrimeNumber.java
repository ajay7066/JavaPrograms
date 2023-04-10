package PepCoding.Basics;

import java.util.*;

public class PrimeNumber {

    public static void solution(int lo,int hi){
        for(int i = lo;i<=hi;i++){

                if(isPrime(i)==true){
                    System.out.println(i);
                }

        }
 }

    public static boolean isPrime(int n){
        for(int div = 2;div<n/2;div++){
            if(n%div==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number : ");
        int low = sc.nextInt();

        System.out.println("Enter the last number : ");
        int high = sc.nextInt();

        solution(low,high);
    }
}

