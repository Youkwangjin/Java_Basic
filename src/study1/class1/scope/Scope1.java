package study1.class1.scope;

public class Scope1 {

    int m = 20; // 인스턴스 변수

    public static void main(String[] args) {
        int m = 10; // 지역변수

        if(true) {
            int x = 20;
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        }
        // System.out.println("x = " + x); 범위 이탈
        System.out.println("m = " + m);
    }
}
