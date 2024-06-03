package study4.poly2;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Animal animal = new Dog();

        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Dog dog = (Dog) animal;
        dog.dogMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅 (부모 타입에서 자식 타입으로 변경)
        // 정확히는 타입으로 바뀌는 것이 아니라 해당 참조값을 꺼내고 꺼낸 참조값이 자식 타입이 되는것이다.
        ((Dog) animal).dogMethod();
    }
}
