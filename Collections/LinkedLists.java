package Collections;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        System.out.println(number);
        number.add(1,0);
        System.out.println(number);

        System.out.println(number.get(3));

        number.set(1,2);
        number.removeFirst();
        System.out.println(number);
    }
}
