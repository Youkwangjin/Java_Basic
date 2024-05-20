package study4.final1;


public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수 (최초 한번만 할당 가능하다.)
        final int data1;
        data1 = 10;

        final int data2 = 10;
        method(10);
    }

    static void method(final  int parameter) {
        // parameter = 20; 컴파일 오류
    }
}
