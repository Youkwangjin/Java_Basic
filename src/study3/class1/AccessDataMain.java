package study3.class1;

public class AccessDataMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // 접근제어자 : public 호출 가능
        accessData.publicField = 100;
        accessData.publicMethod();

        // 접근제어자 : default 호출 가능 (하지만 다른 패키지에서는 접근 불가)
        accessData.defaultField = 200;
        accessData.defaultMethod();

        /*
        접근제어자 : private 호출 불가능
        accessData.privateField = 300;
        accessData.privateMethod();
        */

        // 접근제어자 : public 호출 가능
        accessData.innerAccessMethod();
    }
}
