package PepCoding.array;

import java.util.Scanner;

public class SaddlePoint {

    public static void SaddleValue(int mat[][]){

        for(int i =0;i<mat.length;i++){

            int min =mat[i][0];
            int col = 0;
            for(int j = 1;j<mat.length;j++){
                if(mat[i][j]<min){
                    min = mat[i][j];
                    col = j;
                }
            }

            boolean isSp = true;
            for(int r = 0;r<mat.length;r++){
                if(mat[r][col]>min){
                    isSp = false;
                    break;
                }
            }
            if(isSp==true){
                System.out.println(min);
            }
//        System.out.println("Invalid input");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows : ");
        int r = sc.nextInt();

        System.out.println("How many columns : ");
        int c = sc.nextInt();

        int mat[][] = new int[r][c];
        System.out.println("Enter the elements of matrix : ");
        for(int i= 0;i<r;i++){
            for(int j = 0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        SaddleValue(mat);

    }
}
