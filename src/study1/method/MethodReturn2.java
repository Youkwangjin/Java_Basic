package study1.method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(17);
        checkAge(18);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자는 출입이 불가능합니다.");
        } else {
            System.out.println("입장하세요.");
        }
    }
}
