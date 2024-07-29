package study1.operator;

public class OperatorAdd1 {

    public static void main(String[] args) {

        int a = 0;
        a = a + 1;

        System.out.println("a = " + a); // a = 1
        
        // 후위 증감 연산자 사용
        int b = 0;
        b++;

        System.out.println("b = " + b); // b = 1;
    }
}
