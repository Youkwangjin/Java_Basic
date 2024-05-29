package study5.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에서 T타입이 결정이 된다!
        integerBox.set(10);
        // integerBox.set("문자"); Integer 타입만 하용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능 (선언할 때는 선언 정보가 있어야 해서 생략이 불가능하다)
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
    }
}
