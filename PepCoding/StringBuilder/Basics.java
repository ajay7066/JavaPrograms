package PepCoding.StringBuilder;

public class Basics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);
        sb.setCharAt(3,'L');
        System.out.println(sb);
    }
}
