package study1.class3;

public class ClassStart3 {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        System.out.println("숫자 증가 value = " + valueData.value);
        valueData.value++;

        // 메서드 횔용을 통한 리펙토링
        add(valueData);


    }

    /**
     * 자바에서 메서드는 객체를 생성(new)를 해야 호출할 수 있다.
     * 하지만 static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
     */
    static void add(ValueData valueData) {
        valueData.value++;
    }
}
