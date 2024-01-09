package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);  // this 생략 가능 여기서 this는 자기 자신을 의미한다.
        System.out.println("super value = " + super.value); // super는 부모를 의미한다.

        this.hello();
        super.hello();
    }
}
