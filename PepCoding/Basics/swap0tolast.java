package PepCoding.Basics;
import java.util.Scanner;

public class swap0tolast {
    public static void main(String[] args) {
        int arr[] = {0,2,3,-1,1,1,2,-1,3};

        for(int i = 0;i<arr.length;i++){
            int temp = 0;
                if(arr[i]==0){
            for(int j = i;j<arr.length-1;j++){
                    temp = arr[i];
                    arr[j]=arr[j+1];
                    arr[arr.length-1]=temp;
                    i--;
                }
            }

        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
