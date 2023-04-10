package PepCoding.array;

import java.util.Scanner;

public class ArrayElementSwapping {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner((System.in));


        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int len = n-1;

        int arr[] = new  int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        int si = 0;
        int ei = len;
        while(si<ei){
            int temp = arr[si];
             arr[si] = arr[ei];
             arr[ei] = temp;

             si++;
             ei--;
        }


        si = 0;
        int mid = k;
        while(si<mid-1){
            int temp = arr[si];
            arr[si] = arr[k-1];
            arr[k-1] = temp;

            si++;
            mid--;
        }

        ei = len;
        while(k<ei){
            int temp = arr[k];
            arr[k] = arr[ei];
            arr[ei] = temp;

            k++;
            ei--;
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
