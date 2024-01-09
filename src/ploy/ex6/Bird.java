package ploy.ex6;

public class Bird extends AbstractAnimal implements Fly{ // extends를 통한 상속은 하나만 할 수 있고 implements는 다중 구현이 가능
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날다.");
    }
}
