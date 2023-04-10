package PepCoding.string;

import java.util.*;

public class subString {

    public static void solution(String str){
        for(int  st = 0;st<str.length();st++){
            for(int et = 0;et<str.length();et++){
                String ss = str.substring(st,et+1);

                if(isPalindromic(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }


    public static boolean isPalindromic(String ss){
        int l= 0;
        int e = ss.length()-1;

        while(l<e){
            char lch = ss.charAt(l);
            char ech = ss.charAt(e);

            if(lch!=ech){
                return false;
            }
            l++;
            e--;
        }
        return true;
    }



    public static void main(String[] args) {

        String str = "abccbd";

        solution(str);
    }
}
