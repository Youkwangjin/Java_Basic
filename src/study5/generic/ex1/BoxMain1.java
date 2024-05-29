package study5.generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // auto boxing (타입의 안전성이 높다.)
        Integer integer = integerBox.get(); // 가져오기
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("test");
        String string = stringBox.get(); // 가져오기
        System.out.println("string = " + string);

    }
}
