package PepCoding.array;

import java.util.Scanner;

public class SubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.println("Enter the value of array : ");
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        for(int si = 0;si<arr.length;si++){
            for(int ei = si;ei<arr.length;ei++){
                for(int i = si;i<=ei;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
