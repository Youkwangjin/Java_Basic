package study1.method;

public class MethodEx2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int sum = sum(a, b, c);
        double average = average(sum);
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 20;
        int z = 30;

        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균값: " + average);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum) {
        return sum / 3.0;
    }
}
