package ploy.ex6;

public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() { // 이 메서드는 "상속"을 목적으로 사용된다.
        System.out.println("동물이 이동합니다.");
    }


}
