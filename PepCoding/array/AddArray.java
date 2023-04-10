package PepCoding.array;

import java.util.Scanner;

public class AddArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the size of first array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the element of first array : ");
        for(int i = 0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }


        System.out.println("What is the size of second array : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n1];
        System.out.println("Enter the element of second array : ");
        for(int i = 0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        int len = Math.max(n1,n2)+1;
        int ans[] = new int[len];

        int i = n1-1;
        int j = n2-1;
        int k = len-1;
        int carry = 0;

        while(k>=0){
            int val = 0;
            if(i>=0)
                val = val + arr1[i];

            if(j>=0)
                val = val + arr2[j];

            val = val +carry;

            int rem = val%10;
            int quo = val/10;

            ans[k] = rem;
            carry = quo;

            i--;
            j--;
            k--;
        }

        if(ans[0]!=0)
            System.out.println(ans[0]);

        for(i = 1; i<len; i++){
            System.out.println(ans[i]);
        }

    }
}
