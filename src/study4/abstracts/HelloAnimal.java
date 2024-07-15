package study4.abstracts;

public class HelloAnimal extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("추상 메서드는 자식 클래스가 반드시 오버라이딩해서 사용해야한다.");
    }
}
