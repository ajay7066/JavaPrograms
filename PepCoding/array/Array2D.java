package PepCoding.array;
import java.util.Scanner;

public class Array2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row : ");
        int n= sc.nextInt();
        System.out.print("Enter the value of column : ");
        int m = sc.nextInt();

        int mat[][] = new int[n][m];
        System.out.println("Enter the elements of array : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
