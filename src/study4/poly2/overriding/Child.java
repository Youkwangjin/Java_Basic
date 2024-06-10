package study4.poly2.overriding;

public class Child extends Parent {

    public String value = "child";
    
    // 메서드 오버라이딩
    @Override
    public void method() {
        // super.method(); 상위 클래스에 메서드를 호출 (메서드 오버라이딩이라고 하기엔 애매모호 하다.)
        System.out.println("Child method");
    }
}
