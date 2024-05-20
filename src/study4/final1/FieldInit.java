package study4.final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // this.value = value; 초기값이 있는 경우에는 생성자로 통한 초기화가 되지 않는다.
    }
}
