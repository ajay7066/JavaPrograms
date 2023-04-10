package PepCoding.array;
import java.util.Scanner;


public class routeMatrix {
    public static void main(String args[]){
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

        int var = 0;
        for(int i = 0;i<c;i++){
            for(int j = 0;j<r;j++){
                if(i%2==0){
                    System.out.print(mat[var][i]+" ");
                    var++;
                }
                else{
                    var--;
                    System.out.print(mat[var][i]+" ");
                }
            }
            System.out.println();

        }
    }
}
