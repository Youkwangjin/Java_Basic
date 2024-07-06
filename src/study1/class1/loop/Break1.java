package study1.class1.loop;

public class Break1 {

    public static void main(String[] args) {

        // 지역변수 (Local Variable)
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료합니다. : i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
