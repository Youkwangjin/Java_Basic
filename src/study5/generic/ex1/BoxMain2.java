package study5.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 타입 매게변수 타입 결정
        integerBox.setValue(10);
        // integerBox.setValue("hello"); 컴파일 오류
        Integer integer = integerBox.getValue();
        System.out.println("integer : " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str : " + str);
    }
}
