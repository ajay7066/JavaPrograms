package PepCoding.NumberConversion;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of base : ");
        int b = sc.nextInt();
        int ans = 0;
        int pow = 1;
        while (n>0){
            int quo = n/b;
            int rem = n%b;

            ans = ans + (rem*pow);
            pow = pow * 10;

            n =quo;
        }
        System.out.println(ans);
    }
}

