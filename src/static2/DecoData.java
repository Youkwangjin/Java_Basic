package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;  // 정적 변수에 접근 가능
        staticMethod(); // 정적 메서드에 접근 가능
    }

    public static void staticCall(DecoData decoData) {
        decoData.instanceValue++;
        decoData.instanceMethod();
    }
    
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod();

        staticValue++;
        DecoData.staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
