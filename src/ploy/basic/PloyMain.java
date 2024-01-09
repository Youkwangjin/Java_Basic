package ploy.basic;

public class PloyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // 부모메서드
        child.childMethod();  // 자기 자신 메서드

        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모타입은 자식타입을 참조할 수 있다.
        poly.parentMethod();

        // Child child1 = new Parent(); 자식은 부모를 담을 수 없다.
        poly.parentMethod();

        // poly.childMethod(); 부모는 자식의 기능은 호출할 수 없다. (컴파일 오류)



    }
}