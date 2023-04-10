package PepCoding.Basics;

import java.util.Scanner;

public class toggleNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int i=1;
        while(i*i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}
