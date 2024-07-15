package study4.abstractClass;

public class Cat extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("cat sound");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 고양이가 걸어다닙니다.");
    }
}
