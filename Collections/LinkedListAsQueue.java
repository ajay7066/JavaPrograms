package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C Programming");
        languages.add("HTML");
        languages.add("CSS");

        System.out.println("LinkedList : " +languages);

//        System.out.println("Accessed Element : "+languages.peek());
        System.out.println("After updations : ");
        languages.offer("R PRogramming");
        System.out.println();
//        System.out.println("After  poll : ");
//        languages.poll();
//        System.out.println(languages);

        System.out.println("Access element: ");

        System.out.println(languages.peek());
    }
}
