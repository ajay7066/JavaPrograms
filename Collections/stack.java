package Collections;


import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Cat");
        animals.push("lion");
        animals.push("tiger");
        animals.push("monkey");

        System.out.println(animals);

//        animals.empty();

        System.out.println(animals.empty());
    }
}
