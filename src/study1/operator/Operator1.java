package study1.operator;

public class Operator1 {

    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;
        
        // 덧셈
        int sum = a + b;
        System.out.println("sum = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("diff = " + diff);

        // 곱셈
        int multiply = a * b;
        System.out.println("multiply = " + multiply);

        // 나눗셈 (몫을 구한다.)
        int divide = a / b;
        System.out.println("divide = " + divide);

        // 나머지
        int mod = a % b;
        System.out.println("mod = " + mod);
    }
}
