package study1.class2;

public class NullPointerException {
    /**
     * NullPointerException은 이름 그대로 NULL을 가리킬 때 발생하는 예외이다.
     */
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println(data.value); // Cannot assign field "value" because "data" is null
    }
}
