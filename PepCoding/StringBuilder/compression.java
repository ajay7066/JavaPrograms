package PepCoding.StringBuilder;

import java.util.*;

public class compression {

    public static void compression1(String str){
        StringBuilder ans = new StringBuilder("");

        for(int i =0;i<str.length()-1;i++){
            char c = str.charAt(i);
            char n = str.charAt(i+1);

            if(c != n){
                ans.append(c);
            }
        }
        ans.append(str.charAt(str.length()-1));
        System.out.println(ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        compression1(str);
    }
}
