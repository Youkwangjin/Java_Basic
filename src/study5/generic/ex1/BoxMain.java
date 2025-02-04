package study5.generic.ex1;

public class BoxMain {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue(); // Object -> Integer 캐스팅
        System.out.println("integer : " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue(); // Object -> String 캐스팅
        System.out.println("str : " + str);

        // 잘못된 타입의 인수 전달시 (입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생)
        integerBox.setValue("문자 String");
        Integer result = (Integer) integerBox.getValue();
        System.out.println(result); // ClassCastException 발생!

    }
}
