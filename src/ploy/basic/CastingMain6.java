package ploy.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child) { // java 16버전 부터 변수 설정 가능
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }

    }
}
