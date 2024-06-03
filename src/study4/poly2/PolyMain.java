package study4.poly2;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Animal -> Animal");
        Animal animal = new Animal();
        animal.animalMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Dog -> Dog");
        Dog dog = new Dog();
        dog.dogMethod();
        // Animal 상위 클래스를 상속 받았기 때문에 사용 가능
        dog.animalMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Animal -> Dog");
        Animal poly = new Dog();
        poly.animalMethod();
        // 부모가 자식 인스턴스를 참조한다고 해서 자식 인스턴스의 메서드를 호출할 수 있는건 아니다.
        // poly.dogMethod();

        // 자식 변수는 부모 인스턴스를 참조할 수 없다
        // Dog poly2 = new Animal();
}
}
