package study4.poly.ex3;

// 추상 메서드가 하나라도 선언되어 있으면 추상 클래스로 선언해줘야 한다.
public abstract class AbstractAnimal {

    // 추상 메서드
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
