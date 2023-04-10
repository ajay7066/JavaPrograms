package PepCoding.array;

import java.util.*;
public class DeleteArrayElement {
    public static void main(String[] args) {

        int arr[] = {10,20,10,10,40,30};
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
        }

//        for(int i = 0;i<arr.length;i++){
            System.out.print(count);
//        }

}
}
