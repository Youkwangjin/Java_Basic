package study1.method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
    }

    /*
        1. 모든 메서드는 항상 return을 호출해야한다.
        2. 반환타입이 없는 경우 void로 정의하고 return이 생략가능하다.
     */
    public static void printHeader() {
        System.out.println("반환타입이 없는 메서드입니다.");
        // return; 생략가능
    }
}