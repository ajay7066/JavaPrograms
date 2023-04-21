package Array;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int mat[] = new int[n];
        for(int i = 0;i<n;i++){
            mat[i] = sc.nextInt();
        }

        int si = 0;
        int ei = n-1;

        while(si<ei){
            int temp = mat[si];
            mat[si] = mat[ei];
            mat[ei] = temp;

            si++;
            ei--;
        }

        for(int i = 0;i<n;i++){
            System.out.println(mat[i]);
        }
    }
}
