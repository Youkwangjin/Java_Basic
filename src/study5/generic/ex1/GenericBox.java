package study5.generic.ex1;

/*
    1. <>를 사용한 클래스를 제네릭 클래스라 한다.
    2. 제네릭 클래스를 사용할 때는 Integer, String 같은 타입을 미리 결정하지 않는다.
    3. 대신에 클래스명 오른쪽에 <T>와 같이 선언하면 제네릭 클래스가 된다. 여기서 T를 타입 매게변수라 한다.
    4. 이 타입 매게변수는 이후에 Integer, String으로 변환 할 수 있다.
 */
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
