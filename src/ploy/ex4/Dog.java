package ploy.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
