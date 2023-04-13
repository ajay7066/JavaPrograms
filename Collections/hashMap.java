package Collections;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> lang = new HashMap<>();

        lang.put("java",1);
        lang.put("Pyhton",2);
        lang.put("HTML",3);
        lang.put("C Programming",4);
        lang.put("C++",5);
        lang.put("CSS",6);
        lang.put("JavaScript",7);
        lang.put("R",8);
        System.out.println("HashMap : "+ lang);

    }

}
