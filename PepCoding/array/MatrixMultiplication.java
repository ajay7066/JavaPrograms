package PepCoding.array;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row : ");
        int r1= sc.nextInt();
        System.out.print("Enter the value of column : ");
        int c1= sc.nextInt();

        int a[][] = new int[r1][c1];
        System.out.println("Enter the elements of a matrix : ");
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of row : ");
        int r2= sc.nextInt();
        System.out.print("Enter the value of column : ");
        int c2 = sc.nextInt();

        int b[][] = new int[r2][c2];
        System.out.println("Enter the elements of b matrix : ");
        for(int i = 0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
            int  c[][] = new int [r1][c2];
        if(r1==c2){

            for(int i = 0;i<r1;i++){
                for(int j = 0;j<c2;j++){
                    int val = 0;
                    for(int k = 0;k<c2;k++){
                        val +=a[i][k] + b[k][j];
                    }
                    c[i][j] = val;
                }
            }

            for(int i = 0;i<r2;i++){
                for(int j = 0;j<c2;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The row of 1st matrix is not equals to columns of 2nd matrix");
        }



    }
}

