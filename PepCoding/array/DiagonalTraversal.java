package PepCoding.array;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row : ");
        int r= sc.nextInt();
        System.out.print("Enter the value of column : ");
        int c= sc.nextInt();

        int mat[][] = new int[r][c];
        System.out.println("Enter the elements of a matrix : ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<c;i++){
            int rs = 0;
            for(int j = i;j<c;j++){
                System.out.print(mat[rs][j]+ " ");
                rs++;
            }


        }
    }
}
