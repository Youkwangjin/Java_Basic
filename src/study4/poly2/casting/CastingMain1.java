package study4.poly2.casting;

import study4.poly2.overriding.Child;
import study4.poly2.overriding.Parent;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 자식의 기능(메서드)는 호출할 수 없다.
        // poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        // Child child = poly; 컴파일 오류 : 자식 타입은 부모 타입을 참조할 수 없다.

        /*
            1. 강제로 부모 타입을 참조하는 poly 변수는 자식 타입을 참조하게 된다.
            2. 참고로 캐스팅을 한다고 해서 poly 타입 자체가 변하는것이 아니다!
            3. 해당 참조값을 꺼내고 참조값이 Child 타입이 되는 것이다.
         */
        Child child = (Child) poly;
        poly.method(); // Child method



    }
}
