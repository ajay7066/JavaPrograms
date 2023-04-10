package PepCoding.Basics;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search : ");
        int key = sc.nextInt();
        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid] == key){
                System.out.println(arr[mid]);
                System.out.println(arr[mid]);
            }
            else if (arr[mid] > key) {
                hi = mid-1;
            }
            else{
                lo = hi + 1 ;
            }
        }
    }
}
