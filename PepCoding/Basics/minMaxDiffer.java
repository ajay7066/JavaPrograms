package PepCoding.Basics;

import java.util.Scanner;

public class minMaxDiffer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to add in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            } else if (arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : "+min);
        int span = max-min;
        System.out.println(span);
    }
}
