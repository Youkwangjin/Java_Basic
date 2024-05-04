package study4;

public class ClassStart1 {
    public static void main(String[] args) {
        /**
         * 먼저 넣은 메서드가 나중에 나온다 (stack 구조)
         */
        System.out.println("Hello World");
        method1(10);
        System.out.println("end word");

    }

    static void method1(int m1) {
        System.out.println("m1 start");
        int cal = m1 * 2;
        method2(cal); // 메서드가 실행되고 종료가 되면 이 지점 부터 다시 시작한다.
        System.out.println("m1 end");

    }

    static void method2(int m2) {
        System.out.println("m2 start");
        System.out.println("m2 end");

    }
}
