package PepCoding.Basics;
import java.util.Scanner;

public class LastFirstIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to find : ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length-1;
        int fstIndex = -1;
        while (low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==key){
                fstIndex = mid;
                high = mid-1;
            } else if (arr[mid]<key) {
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length-1;
        int lstIndex = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == key){
                lstIndex = mid;
                low = mid+1;
            } else if (arr[mid]<key) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }

        System.out.println(fstIndex);
        System.out.println(lstIndex);
    }
}
