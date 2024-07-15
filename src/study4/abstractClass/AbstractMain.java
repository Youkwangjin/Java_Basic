package study4.abstractClass;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스는 인스턴스 생성 불가
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        dog.move();
        dog.sound();

        Cat cat;
        cat = new Cat();
        cat.move();
        cat.sound();
    }
}
