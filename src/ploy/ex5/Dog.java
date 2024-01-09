package ploy.ex5;

public class Dog implements InterfaceAnimal{  // 인터페이스를 구현받을 때는 implements 키워드 사용!

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
