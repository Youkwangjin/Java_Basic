package study3.class1;

public class PublicClassInnerMain {

    public static void main(String[] args) {

        /*
            1. Public, Default 접근 제어자는 같은 패키지에 접근이 가능하다.
            2. 하지만 private 접근제어자는 접근이 불가능하다.
         */
        PublicClass pc = new PublicClass();
        DefaultClass1 dc1 = new DefaultClass1();
        DefaultClass2 dc2 = new DefaultClass2();
    }
}
