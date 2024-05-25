package study4.poly.ex4;

// 추상 메서드가 하나라도 선언되어 있으면 추상 클래스로 선언해줘야 한다.
public abstract class AbstractAnimal {

    // 추상 메서드 (자식 클래스는 반드시 오버라이딩 해야한다.)
    public abstract void sound();
    public abstract void move();
}
