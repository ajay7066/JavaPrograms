package PepCoding.Pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n*2-3;

        for(int i = 1;i<=n;i++){
            int val = 1;
            for(int j = 1;j<=nst;j++){
                System.out.print(val+"\t");
                val++;
            }

            for(int j=1;j<=nsp;j++){
                System.out.print(" \t");
            }

            if(i==n){
                nst--;
            }
            if(i<n){
                val-=1;
            }
            else{
                val-=2;
            }
            for(int j = 1;j<=nst;j++){
                System.out.print(val+"\t");
                val--;
            }
//            val--;
            nst++;
            nsp = nsp-2;
            System.out.println();
        }
    }
}
