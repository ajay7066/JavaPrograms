package pattern;

import java.util.*;

public class arrowNumberPattern {
    public static void main(String[] args) {
        int n = 9;

        int val = n/2;

        for(int i = 0;i<n;i++){

            if(i<=n/2){
                for(int j = i;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            else {
                for(int j = val;j>=1;j--){
                    System.out.print(j+" ");
                    val--;
                }
            }

            System.out.println();

        }
    }
}
