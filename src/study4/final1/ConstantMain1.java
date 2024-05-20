package study4.final1;

public class ConstantMain1 {
    /*
        1. 이 코드는 유지보수하기 매우 안좋은 코드이다.
        2. 프로그램 최대 참여자 수를 수정하려면 여러 군데 수정해야한다.
        3. 이때 필요한게 클래스에 바로 접근해서 사용할 수 있는 static 변수 이다.
     */
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자 명단으로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
