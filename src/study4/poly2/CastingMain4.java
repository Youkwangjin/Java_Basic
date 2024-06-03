package study4.poly2;

public class CastingMain4 {

    public static void main(String[] args) {
        // 다운 캐스팅을 자동으로 하지 않는 이유
        Animal animal1 = new Dog();
        Dog dog1 = (Dog) animal1;
        dog1.dogMethod();

        Animal animal2 = new Animal();
        // Dog dog2 = (Dog) animal2; ClassCastException 런타임 오류 발생
        /*
            1. 발생이유 : new Animal()로 부모 타입으로 객체를 먼저 생성했다. 따라서 Heap 메모리상에는 자식 타입 인스턴스는 존재하지 않는다.
            2. animal2 변수를 자식 타입으로 다운 캐스팅을 해도 메모리상에는 자식 인스턴스가 존재하지 않기 때문에
            3. 예외를 발생시킨다.
         */
        // dog2.dogMethod();

    }
}
