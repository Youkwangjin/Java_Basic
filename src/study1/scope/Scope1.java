package study1.scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작 (main 메서드 안에서만)
        if (true) {
            int x = 20; // x 생존 시작 (if문 블록 안에서만)
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        // System.out.println(x); if 범위 밖이여서 x은 생존종료
    }
}
