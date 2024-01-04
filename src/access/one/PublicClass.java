package access.one;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default 같은 패키지 안에서만 호출 가능
class DefaultClass1 {

}

class DefaultClass2 {

}