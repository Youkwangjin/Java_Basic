package study4.poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스(객체) 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스(객체) 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        // 상속을 받았으니 부모 클래스에 기능을 사용이 가능
        child.parentMethod();

        // 부모 변수가 자식 인스턴스(객체) 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); => 컴파일 오류 (다형적 참조의 한계)


    }
}
