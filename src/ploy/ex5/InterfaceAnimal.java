package ploy.ex5;

public interface InterfaceAnimal {
    void sound(); // public abstract 생략! 인터페이스는 보통 여러곳에 사용하는 목적이기 때문에 접근제어자를 public 으로 설정한다.
    void move();
}
