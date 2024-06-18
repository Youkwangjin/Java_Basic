package study4.poly2.casting;

import study4.poly2.overriding.Child;
import study4.poly2.overriding.Parent;

public class CastingMain4 {

    public static void main(String[] args) {

        Parent p1 = new Child();
        Child c1 = (Child) p1;
        c1.childMethod();

        Parent p2 = new Parent();
        Child c2 = (Child) p2;
        // c2.childMethod(); -> (자바에서는 사용할 수 없는 타입으로 다운 캐스팅 하는 경우에 ClassCastException 발생한다.)

    }
}
