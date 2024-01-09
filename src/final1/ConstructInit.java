package final1;

public class ConstructInit {
    final int value; // final을 멤버변수에 초기화 하는 경우에는 생성자를 통해서 한번만 초기화 될 수 있다.

    public ConstructInit(int value) {
        this.value = value;
    }
}
