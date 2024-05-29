package study5.generic.ex1;

public class IntegerBox {

    private Integer value;

    // 숫자를 저장한다 (set)
    public void set(Integer value) {
        this.value = value;
    }

    // 숫자를 꺼내서 사용한다 (get)
    public Integer get() {
        return value;
    }
}
