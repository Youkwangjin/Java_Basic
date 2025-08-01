package study1.operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);

        boolean result = a > b;
        System.out.println("result: " + result);
    }
}
