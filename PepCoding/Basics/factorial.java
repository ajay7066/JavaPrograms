package PepCoding.Basics;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n - r);

        int ans = nfact / (rfact * nmrfact);
        System.out.println(ans);
    }

    public static int fact(int x) {
        int factorial = 1;
        for(int i=2;i<=x;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
