package study3;

public class ClassStart4 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        DataTwo data1 = new DataTwo("A", counter);
        System.out.println(data1);
        System.out.println("A count = " + counter.count);

        DataTwo data2 = new DataTwo("B", counter);
        System.out.println(data2);
        System.out.println("B count = " + counter.count);

        DataTwo data3 = new DataTwo("C", counter);
        System.out.println(data3);
        System.out.println("C count = " + counter.count);
    }
}
