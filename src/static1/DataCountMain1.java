package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        /*
            하나의 인스턴스가 계속 만들었기 때문에 숫자가 증가하지 않는다.
         */
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data1.count);
    }


}
