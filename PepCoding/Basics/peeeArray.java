package PepCoding.Basics;

public class peeeArray {
    public static void main(String args[]){
        int arr[] = {10,20,13,20,27,22};

        for(int i=1;i<arr.length-1;i++){
            if ((arr[i]>arr[i+1] )&& (arr[i]>arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
