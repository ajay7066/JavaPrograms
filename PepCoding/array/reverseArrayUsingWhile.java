package PepCoding.array;

import java.util.Scanner;

public class reverseArrayUsingWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Entetr the array elements : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int si = 0;
        int ei = n-1;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i] );
        }


    }
}
