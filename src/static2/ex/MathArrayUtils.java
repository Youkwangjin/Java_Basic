package static2.ex;

public class MathArrayUtils {
    /*
        *** 문제 요구사항 ***
        1. MathArrayUtils은 객체를 생성하지 않고 사용해야한다.
        2. 누군가 실수로 MathArrayUtils의 인스턴스를 생성하지 못하게 막아야 한다. (생성자를 private으로 막아버리자!)
     */

    private MathArrayUtils() {
        // private으로 인스턴스 생성을 막는다.
    }


    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length; // 소숫점이 나올 수 있으니 double로 형변환
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
