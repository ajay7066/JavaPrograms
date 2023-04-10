package Collections;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
//        languages.add("HTML");
        languages.add("CSS");
        languages.add("HTML");

//        languages.set(2,"JavaScript");
        // natural order : ascending order
//        languages.sort(Comparator.naturalOrder());
//        System.out.println(languages);


//        ArrayList<String> cloneList =(ArrayList<String>)languages.clone();
        //reverse order : decending order
//        languages.sort(Comparator.reverseOrder());
//        System.out.println(languages);
//        System.out.print(cloneList+" ");
//        languages.clear();
//        System.out.println(languages.isEmpty());

        int i = languages.indexOf("HTML");
        System.out.println(i);
    }


}
