package study4;

public class ClassStart2 {

    /**
     * main() -> method1() -> method2() 방식으로 호출
     * 지역변수 (메서드 내부 영역에 선언된 변수) 스택 영역에, 객체(인스턴스)는 힙 영역에 관리된다.
     */
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); // 인스턴스는 heap 영역에 들어간다.
        method2(data1); // method2는 method1에서 생성한 인스턴스를 참조할 수 있다.
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
