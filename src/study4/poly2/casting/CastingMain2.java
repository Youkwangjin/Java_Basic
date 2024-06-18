package study4.poly2.casting;

import study4.poly2.overriding.Child;
import study4.poly2.overriding.Parent;

public class CastingMain2 {

    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        Child child = (Child) poly;
        poly.method(); // Child method

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod();

    }
}
