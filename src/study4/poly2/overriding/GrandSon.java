package study4.poly2.overriding;

public class GrandSon extends Child {

    public String value = "GrandSon";

    @Override
    public void method() {
        System.out.println("GrandSon method");
    }
}
