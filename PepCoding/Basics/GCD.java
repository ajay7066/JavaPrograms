package PepCoding.Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Divisor : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value Dividend : ");
        int n2 = sc.nextInt();

        int divisor = n1;
        int dividend = n2;
        while (dividend%divisor!=0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        int gcd = divisor;
        int lcm = (n1*n2)/gcd;
        System.out.print("PepCoding.Basics.GCD : "+gcd);
        System.out.println();
        System.out.print("LCM : "+lcm);
    }
}
