package study2.class1;

public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass =  new PublicClass();
        DefaultClass1 d1 = new DefaultClass1();
        DefaultClass2 d2 = new DefaultClass2();
    }
}

// DefaultClass 는 같은 클래스에서는 접근이 가능하다.
class DefaultClass1 {

}

class DefaultClass2 {


}
