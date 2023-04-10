package PepCoding.array;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
//        System.out.println(arr[1]);

        arr[2] = 10;

//        System.out.println(arr[3]);

        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
