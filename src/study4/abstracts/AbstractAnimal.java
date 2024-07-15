package study4.abstracts;

/*
    1. 추상 (abstract) 메서드가 하나라도 있으면 abstract 키워드를 class 앞에 적어줘야 한다.
    2. 추상 메서드는 바디가 없다.
    3. 추상 메서드는 자식 클래스가 반드시 오버라이딩해서 사용해야한다.
 */
public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        System.out.println("이 메서드는 추상 메서드가 아니기 때문에 자식 클래스가 오버라이딩 하지 않아도 된다.");
    }
}
