package study5.generic.ex1;

public class GenericBox<T> {

    // T는 타입 매게변수 이 타입 매개변수는 integer, string으로 변환이 가능하다.
    private T value;

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
