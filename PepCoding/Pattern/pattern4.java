package PepCoding.Pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n/2;

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }

            if(i<=n/2){
                nst = nst+2;
                nsp--;
            }
            else{
                nst = nst-2;
                nsp++;
                System.out.println();
            }
        }
    }
}
