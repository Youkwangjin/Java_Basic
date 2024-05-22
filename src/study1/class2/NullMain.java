package study1.class2;

public class NullMain {

    public static void main(String[] args) {
        Data dataA = null;
        System.out.println("1. Data = " + dataA); // NULL
        dataA = new Data();
        System.out.println("2. Data = " + dataA); // Data@6d311334
        dataA = null;
        System.out.println("3. Data = " + dataA); // NULL
    }
}
