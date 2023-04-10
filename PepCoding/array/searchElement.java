package PepCoding.array;

import java.util.Scanner;

public class searchElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to add in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array : ");

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search : ");
        int d= sc.nextInt();
        int flag = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==d){
                flag = 1;
                System.out.println(i);
            }
        }

        if(flag == 0){
            System.out.println("-1");
        }
    }
}