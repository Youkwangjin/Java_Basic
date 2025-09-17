package study1.method;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(1, 2); // 메서드를 호출할 때 메서드에 넘기는 값을 Argument (인수)
        System.out.println("sum1 = " + sum1);

        int sum2 = add(1, 10);
        System.out.println("sum2 = " + sum2);

    }

    // 객체를 생성하지 않고 호출할 수 있는 정적 메서드
    public static int add(int a, int b) { // 메서드를 정의할 때 선언한 변수를 Parameter
        System.out.println(a + "+" + b + "=" + (a + b));
        int sum = a + b;
        return sum;
    }
}
