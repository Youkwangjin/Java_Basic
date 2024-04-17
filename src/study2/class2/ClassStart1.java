package study2.class2;

public class ClassStart1 {

    /**
     * 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
     */

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a); // a = 10
        System.out.println("b = " + b); // b = 10

        // a 값을 20으로 변경
        a = 20;
        System.out.println("a = " + a); // a = 20
        System.out.println("b = " + b); // a = 10
    }
}
