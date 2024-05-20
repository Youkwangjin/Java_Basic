package study4.final1;

public class ConstructInit {

    // final을 필드에 사용할 경우 해당 필드는 생성자를 통해서 한번만 초기화 될 수 있다.
    final int value;

    public ConstructInit (int value) {
        this.value = value;
    }
}
