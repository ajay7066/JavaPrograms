package Array;

import java.util.*;

public class sortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");
        int mat[] = new int[n];
        for(int i = 0;i<n;i++){
            mat[i] = sc.nextInt();
        }
        System.out.print("Before Sort : ");
        for(int i = 0;i<n;i++){
            System.out.print(mat[i]+" ");
        }

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(mat[j]<mat[i]){
                    int temp = mat[i];
                    mat[i] = mat[j];
                    mat[j] = temp;

                }
            }
        }
        System.out.println();

        System.out.print("After sort : ");
        for(int i = 0;i<n;i++){
            System.out.print(mat[i]+" ");
        }
    }
}
