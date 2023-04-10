package PepCoding.array;

import java.util.Scanner;

public class searchSorted2DArray {
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


        int r1 = 0;
        int c1 = mat[0].length-1;

        while(r1<r && c1>=0){

            if(key==mat[r1][c1]){
                System.out.println(r1 + " "+c1);
                break;
            } else if (key<mat[r1][c1]) {
                c1--;
            }else {
                r1++;
            }
        }
    }
}


