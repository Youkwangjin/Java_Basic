package study4.abstractClass;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동한다.");
    }
}
