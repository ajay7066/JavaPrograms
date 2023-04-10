package PepCoding.Pattern;

import java.util.Scanner;

public class pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int nsp = 0;
        int nst = 1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=nsp;j++){
                System.out.print(" \t");
            }
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }

            nsp++;
            System.out.println();
        }
    }
}
