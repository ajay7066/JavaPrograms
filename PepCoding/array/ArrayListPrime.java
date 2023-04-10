package PepCoding.array;

import java.util.*;

public class ArrayListPrime {

    public static void solution(ArrayList<Integer> num){
        for(int i = 0;i<num.size();i++){
            int ele = num.get(i);

            if(isPrime(ele)==true){
                num.remove(i);
                i--;
            }
        }
    }

    public static boolean isPrime(int ele){
        for(int div  = 2;div*div<ele;div++){
            if(ele%div==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(3);
        num.add(5);
        num.add(6);

        solution(num);

        System.out.println(num);
    }
}
