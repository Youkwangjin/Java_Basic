package study1.scope;

public class Scope2_1 {

    public static void main(String[] args) {
        int m = 10;

        int temp = 0; // 임시변수 if 절에만 사용하는게 좋다 비효율적인 메모리 사용

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m " + m);
    }
}
