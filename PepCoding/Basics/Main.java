package PepCoding.Basics;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Which Character count you want : ");
        char character = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == character){
                count++;
            }
        }
        System.out.print("The count of "+ character + " is :  "+ count);

    }
}