package study5.exception.ex1;

public class ExceptionClass {

    public static void main(String[] args) {
        int a, b, c; // 지역변수 초기화 (클래스 필드 초기화와 달리 어떠한 초기값도 할당되지 않는다.)
        try {
            a = 10;
            b = 2;
            c = a / b;
            System.out.println("계산 결과 : " + c);
            System.out.println("예외가 발생하지 않았습니다.");
        } catch (ArithmeticException  e) {
            System.out.println("예외가 발생했습니다!" + e.getMessage());
        }
    }
}
