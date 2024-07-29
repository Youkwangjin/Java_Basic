package study1.operator;

public class Operator3 {

    public static void main(String[] args) {

        int sum1 = 1 + 2 * 3;
        // () 먼저 우선 순위를 갖는다.
        int sum2 = (1 + 2) * 3;

        System.out.println("sum1 = " + sum1); // 7
        System.out.println("sum2 = " + sum2); // 9
    }
}
