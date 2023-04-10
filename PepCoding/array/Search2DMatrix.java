package PepCoding.array;

import java.util.Scanner;

public class Search2DMatrix {

    public static void searchMatrix(int mat[][],int key){

        boolean keyFound = false;
        for(int i  = 0;i<mat.length;i++){
            int si = 0;
            int ei = mat.length-1;

            if(key>mat[i][si] && key<mat[i][ei]){
                for(int j = 0;j<mat.length;j++){
                    if(mat[i][j]==key){
                        keyFound = true;
                        break;
                    }
                }
            }
        }
        if(keyFound==true){
            System.out.println(keyFound);
        }
        else{
            System.out.println(keyFound);
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

        System.out.println("Enter a key to find : ");
        int key = sc.nextInt();


        searchMatrix(mat,key);

    }
}
