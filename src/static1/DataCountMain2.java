package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        /*
            Counter 인스턴스에 있는 count 값이 누적이 되는 로직
         */
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }

}
