package ploy.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child) { // parent instanceof Child -> Child c = new Parent(); 하지만 자식은 부모를 담을 수 없다.
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }

    }
}
