package BasicPrograms;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number : ");
        int low = sc.nextInt();

        System.out.println("Enter the end number : ");
        int high = sc.nextInt();

        findPrime(low, high);
    }

    public static void findPrime(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
}