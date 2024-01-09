package ploy.diamond;

public class Child implements InterfaceA, InterfaceB { // 인터페이스는 다중 "구현"이 가능하다.
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
    @Override
    public void methodCommon() {  // 중복된 메서드는 하나만 오버라이딩 하면 된다.
        System.out.println("methodCommon");
    }
}
