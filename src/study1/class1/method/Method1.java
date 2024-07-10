package study1.class1.method;

public class Method1 {

    public static int sumMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a + b = " + (a + b));

        int sum1 = a + b;
        System.out.println("sum1 = " + sum1);

        int sum2 = sumMethod(1,2);
        System.out.println(sum2);

    }
}
