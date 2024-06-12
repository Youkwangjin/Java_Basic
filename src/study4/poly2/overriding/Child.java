package study4.poly2.overriding;

public class Child extends Parent {

    public String value = "child";
    
    // 메서드 오버라이딩
    @Override
    public void method() {
        // super.method(); 상위 클래스에 메서드를 호출
        System.out.println("Child method");
    }
}
