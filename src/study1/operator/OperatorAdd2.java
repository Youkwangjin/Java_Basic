package study1.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        int  a = 1;
        int  b = 0;

        b = ++a; // a의 값을 먼저 증가 시킨 다음에 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

    }
}
