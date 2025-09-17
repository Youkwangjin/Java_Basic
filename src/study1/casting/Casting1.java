package study1.casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("long value : " + longValue);

        doubleValue = (double)intValue;
        System.out.println("double value : " + doubleValue);

        doubleValue = 20L;
        System.out.println("double value2 : " + doubleValue);
    }
}