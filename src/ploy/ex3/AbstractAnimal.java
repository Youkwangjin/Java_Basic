package ploy.ex3;

public abstract class AbstractAnimal { // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    public abstract void sound(); // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
    public void move() { // 자식이 상속을 받아 사용하는 목적으로 만듬!
        System.out.println("동물이 움직입니다.");
    }
}
