package study1.cond;

public class IfEx2 {

    public static void main(String[] args) {

        int age = 14;

        /*
            다중 if문인 경우 불필요한 조건 검사가 일어난다. else if문을 사용하자

        if (age <= 7) {
            System.out.println("조건 검사 시작");
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("조건 검사 시작");
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("조건 검사 시작");
            System.out.println("중학생");
        }
         */

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

    }
}
