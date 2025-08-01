package study1.operator;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); // and는 두 조건이 무조건 참 하나라도 거짓이면 거짓이 된다.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        System.out.println("||: OR 연산"); // or는 두 조건중 "하나"라도 참이면 참이된다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }
}
