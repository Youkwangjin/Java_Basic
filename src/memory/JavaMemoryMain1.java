package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        /*
            스택 구조 (main이 먼저 들어왔지만 가장 마지막에 나오고 가장 마지막에 들어간 메서드가 제일 먼저 나온다.)
         */
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}
