package PepCoding.array;
import java.util.Scanner;

public class spiralOrderMatrix {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rows : ");
        int row = sc.nextInt();

        System.out.println("How many columns : ");
        int col = sc.nextInt();

        int mat[][] = new int[row][col];
        System.out.println("Enter the elements of matrix : ");
        for(int i= 0;i<row;i++){
            for(int j = 0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int rs = 0;
        int re = row-1;
        int cs = 0;
        int ce = col-1;
        int tot = 0;
        while(tot<row*col){
            for(int r=rs;r<=re && tot<row*col;r++){
                System.out.println(mat[r][cs]);
                tot++;
            }
            cs++;
            for(int c=cs;c<=ce && tot<row*col;c++){
                System.out.println(mat[re][c]);
                tot++;
            }
            re--;
            for(int r=re;r>=rs && tot<row*col;r--){
                System.out.println(mat[r][ce]);
                tot++;
            }
            ce--;
            for(int c=ce;c>=cs && tot<row*col;c--){
                System.out.println(mat[rs][c]);
                tot++;
            }
            rs++;
        }
        
    }
}
