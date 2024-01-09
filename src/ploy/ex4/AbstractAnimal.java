package ploy.ex4;

/*
    1. 이러한 순수 추상 메서드는 실행 로직을 전혀 가지고 있지 않다.
    2. 다형성을 위한 부모 타입으로서 껍데기 역할만 제공할 뿐이다.
 */
public abstract class AbstractAnimal {
    public abstract void sound(); // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
    public abstract void move();
}
