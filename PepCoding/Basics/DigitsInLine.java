package PepCoding.Basics;

import java.util.Scanner;
public class DigitsInLine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int N = n;
        int pow  = 1;
        while(N>10){
            pow = pow*10;
            N = N/10;
        }
        while(n>0){
            int firstDigit = n/pow;
            System.out.println(firstDigit);
            n = n%pow;
            pow = pow/10;
        }

    }
}
