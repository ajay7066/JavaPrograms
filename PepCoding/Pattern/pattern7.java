package PepCoding.Pattern;

import java.util.Scanner;

public class pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of  n : ");
        int n = sc.nextInt();

        int nst = 1;
        int nsp = 0;
        int nsp1 = n-2;

        for(int i =1;i<=n;i++){

            for(int j = 1;j<=nsp;j++){
                System.out.print(" \t");
            }

                System.out.print("*\t");

            for(int j = 1;j<=nsp1;j++){
                System.out.print(" \t");
            }
            if(i!=n/2+1){
                System.out.println("*\t");
            }


            if(i<=n/2){
                nsp++;
                nsp1 = nsp1-2;
            }

            else{
                nsp--;
                nsp1 = nsp1+2;
            }
            System.out.println();
        }
    }
}
