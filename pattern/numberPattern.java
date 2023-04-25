package pattern;

import java.util.*;

public class numberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nsp = n-1;

        int val = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(val==j/2){
                    val--;
                    System.out.print(val+" ");

                }
                else{
                    System.out.print(val+" ");
                    val++;
                }

            }
            nsp--;
            System.out.println();
        }
    }
}
