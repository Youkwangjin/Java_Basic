package study4.interfaces;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("cat sound");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}
