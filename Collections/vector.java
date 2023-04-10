package Collections;

import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        Vector<Integer> numbers = new Vector<>();

        numbers.addAll(vector);

        numbers.add(2,5);
        System.out.println(numbers);

//        System.out.println(vector);


    }
}
