package PepCoding.Pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of previvous number : ");
        int prev = sc.nextInt();

        System.out.print("Enter the value of current number : ");
        int curr = sc.nextInt();

        int next = 0;

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(prev+" \t");
                next = prev + curr;
                prev = curr;
                curr = next;
            }
            System.out.println();
        }
    }
}
