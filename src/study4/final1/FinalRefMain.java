package study4.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 참조형 변수 data는 final이 붙었기 때문에 참조형 변수에 들어있는 참조값을 다른 값으로 변경하지 못한다.
        final Data data = new Data();

        // 참조 대상의 값은 변경 가능하다. (value는 final로 설정하지 않았기 때문에 변경 가능한 이유이다.)
        data.setValue(10);
        System.out.println(data.getValue());



    }
}
