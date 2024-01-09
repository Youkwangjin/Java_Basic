package ploy.basic;

// upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child;  // 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없다.
        Parent parent2 = (Parent) child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
