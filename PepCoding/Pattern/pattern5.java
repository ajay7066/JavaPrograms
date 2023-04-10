package PepCoding.Pattern;

import java.util.Scanner;
public class pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int nst = n/2+1;
        int nsp = 1;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }
            for(int j = 1;j<=nsp;j++){
                System.out.print(" \t");
            }
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                nst--;
                nsp = nsp+2;
            }
            else{
                nst++;
                nsp = nsp-2;
            }
            System.out.println();
        }
    }
}
