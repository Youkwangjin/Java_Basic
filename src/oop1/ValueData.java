package oop1;

public class ValueData {
    int value;

    /*
        원래 메서드는 객체를 생성해야 호출할 수 있다. 하지만 전에는 객체 생성없이 메서드를 호출했기 때문에 static 를 붙인것이다.
     */
    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
