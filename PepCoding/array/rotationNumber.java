package PepCoding.array;

import java.sql.SQLOutput;
import java.util.Scanner;
public class rotationNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();
        int N=n;
        int pow = 1;
        for(int i=1;i<=k;i++){
            pow = pow * 10;
//            n = n/10;
        }
        int rem = n%pow;
//        System.out.println(rem);
         n = n/pow;
//        System.out.println(n);
        int count = 0;
        while(N>0){
            count++;
            N=N/10;

        }
//        System.out.println(count);

        k= count-k;
        int power = 1;
        for(int i = 1;i<=k;i++){
            power = power*10;
        }
//        System.out.println(power);
        rem = rem*power;

        int rotate = rem+n;
        System.out.println(rotate);
    }
}
