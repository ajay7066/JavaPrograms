package PepCoding.array;

import java.util.Scanner;


public class Rotate90Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row : ");
        int r = sc.nextInt();

        System.out.println("How many columns : ");
        int c = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        char mat[][] = new char[r][c];

        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.next().charAt(0);
            }
        }



       for(int i = 0;i<r;i++){
           for(int j = i;j<c;j++){
                char temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
           }
       }

        for(int i = 0;i<r;i++){
            int si = 0;
            int ei = c-1;
            while(si<ei){
                char temp = mat[i][si];
                mat[i][si] = mat[i][ei];
                mat[i][ei] = temp;
                si++;
                ei--;
            }
        }

       for(int i = 0;i<r;i++){
           for(int j = 0;j<c;j++){
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
    }
}
