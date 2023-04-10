package PepCoding.array;

import  java.util.Scanner;

public class ExitPointMatrix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        System.out.println("ENter the row : ");
        int r = sc.nextInt();

        System.out.println("Enter the column : ");
        int c = sc.nextInt();

        System.out.println("Enter the matrix elements");
        int mat[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int i= 0;
        int j = 0;

        int dir = 0;
        while(i>=0 && j>=0 && i<r && j<c){
            dir = (dir + mat[i][j])%4;
            if(dir==0){
                j++;
            }
            if(dir==1){
                i++;
            }
            if(dir==2){
                j--;
            }
            if(dir==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }
            if(j<0){

                j++;
                break;
            }
            if(i==r){
                i--;
                break;
            }
            if(j==c){
                j--;
                break;
            }
        }
        System.out.println((i)+ " "+(j));
    }
}
