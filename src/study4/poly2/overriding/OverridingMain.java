package study4.poly2.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩이 되자 않는다.
        poly.method(); // 메서드는 오버라이딩이 된다. (오버라이딩 된 메서드는 항상 우선권을 가진다.)

        // 자식 변수는 부모 타입을 참조할 수 없다.
        // Child child1 = new Parent();

        // 부모 타입은 상속 받은 자식의 손자 타입 까지 참조 할 수 있다.
        Parent poly2 = new GrandSon();
        System.out.println("parent -> GrandSon");
        poly2.method();
    }
}
