package PepCoding.array;

import java.util.*;

public class RingRotate {

    public static void display(int r, int c){
        int mat[][] = new int[r][c];

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(mat[i][j] );
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row : ");
        int r = sc.nextInt();

        System.out.println("Enter the column  :");
        int c = sc.nextInt();

        System.out.println("Enter the element of array : ");
        int mat[][] = new int[r][c];

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }


        display(r,c);
    }
}
