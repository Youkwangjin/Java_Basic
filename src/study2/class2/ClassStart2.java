package study2.class2;

public class ClassStart2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA.value); // 10
        System.out.println("dataB 참조값 = " + dataB.value); // 10

        System.out.println("======================");

        dataA.value = 20;
        System.out.println("dataA value 변경 후 : " + dataA.value);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataB 값 = " + dataB.value);

        System.out.println("======================");

        dataA.value = 30;
        System.out.println("dataA value 변경 후 : " + dataA.value);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataB 값 = " + dataB.value);
    }
}
