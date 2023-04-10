package PepCoding.NumberConversion;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the base that you want to convert it into another : ");
        int b1 = sc.nextInt();
        System.out.print("Enter the second base : ");
        int b2 = sc.nextInt();
        int ans  =0;
        int pow = 1;


        while(n>0){
//            int quo = n/b2;
            int rem = n%b2;

            ans = ans+(rem*pow);
            pow = pow*b1;

            n =n/b2;
        }
        System.out.println(ans);
    }
}
