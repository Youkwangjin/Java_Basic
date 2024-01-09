package ploy.overriding;

public class Child extends Parent {
    public String value = "child";

    @Override // 재정의! (만약 이 부모와 동일한 메서드가 없을 경우에는 부모 클래스에 있는 메서드를 찾는다.)
    public void method() {
        System.out.println("child.method");
    }
}
