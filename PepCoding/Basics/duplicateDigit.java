package PepCoding.Basics;

import java.util.Scanner;

public class duplicateDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to get his count : ");
        int dig = sc.nextInt();
        int count = 0;
        while(num>0){
            int rem = num%10;

            if(dig == rem ){
                count++;

            }
            num = num/10;
        }
        System.out.println(count);
    }
}
