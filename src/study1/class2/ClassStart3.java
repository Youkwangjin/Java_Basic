package study1.class2;

public class ClassStart3 {

    /**
     * 대원칙 : 자바의 대입은 항상 변수의 "값"을 복사해서 대입한다.
     */

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
