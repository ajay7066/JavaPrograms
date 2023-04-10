package PepCoding.array;

import java.util.Scanner;

public class Series {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int temp = 0;
    for(int i = 0;i<n;i++){
        int result = b + temp;
        temp = 0;
        for(int j = 1;j<=i;j++){
               temp  =  temp + i*b;
        }
        System.out.println(result);
    }

    }
}
