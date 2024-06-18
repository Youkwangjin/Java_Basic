package study4.poly2.casting;

import study4.poly2.overriding.Child;
import study4.poly2.overriding.Parent;

public class CastingMain3 {

    public static void main(String[] args) {
        
        // 업 캐스팅과 다운 캐스팅 비교
        Child child = new Child();
        // 업 캐스팅은 생략 (오히려 자바에서 권장한다)
        Parent parent1 = (Parent) child;
        Parent parent2 = child;
        parent1.method();
        parent2.method();

    }
}
