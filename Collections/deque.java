package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> num = new ArrayDeque<>(10);

        num.offer(1);
        System.out.print("After adding element : "+num+"\n");

        num.offerFirst(0);
        System.out.print("After adding to first, Deque is : "+num+"\n" );

        num.offerLast(2);
        System.out.print("After adding at last, Deque is :"+num+"\n");

        num.offerLast(3);
        num.offerLast(4);
        num.offerLast(5);
        num.offerLast(6);
        num.offerLast(7);
        num.offerLast(8);
        num.offerLast(9);

        num.addLast(10);
        System.out.println(num);

        int n = num.peekLast();
        System.out.println("Peek Last"+n);

    }

}
