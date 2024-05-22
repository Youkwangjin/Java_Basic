package study1.class2;

public class ClassStart4 {

    /**
     * 대원칙 : 자바의 대입은 항상 변수의 "값"을 복사해서 대입한다.
     */

    public static void main(String[] args) {
        Data dataA = new Data(); // ex) dataA = x001
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); // 10
        changeRefer(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); // 10

    }

    public static void changeRefer(Data dataX) {
        dataX.value = 20;
    }
}
