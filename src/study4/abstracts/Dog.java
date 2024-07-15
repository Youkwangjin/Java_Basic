package study4.abstracts;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {

    }

    @Override
    public void move() {
        System.out.println("추상 메서드가 아니지만 자식이 오버라이딩해서 사용해도 상관없다.");
    }
}
