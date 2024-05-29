package study5.generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        GenericBox<Object> objectGenericBox = new GenericBox<>(); // 권장 방식
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result: " + result);
        
    }
}
