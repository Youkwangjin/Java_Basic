package study4;

public class ClassStart3 {
    public static void main(String[] args) {

        /**
         * DataOne 타입의 인스턴스를 3개를 만들었다.
         * DataOne 클래스는 객체(인스턴스)를 하나씩 호출할 때 마다 인수턴스 변수로 인해 count 값이 0 -> 1 이 된다.
         * 따라서 3개 인스턴스를 만들었기 때문에 출력은 1, 2, 3으로 나온다고 생각했으면 자바 공부를 다시해야한다.
         * 또한 인스턴스에 사용되는 멤버 변수 count 값은 인스턴스끼리 서로 공유가 되지 않는다.
         * 따라서, 각각 Count 1이 3번 찍힌다.
         */

        DataOne one = new DataOne("A");
        System.out.println(one); // DataOne@4eec7777
        System.out.println("A Count = " + one.count );

        DataOne two = new DataOne("A");
        System.out.println(two); // DataOne@4dd8dc3
        System.out.println("A Count = " + two.count );

        DataOne three = new DataOne("A");
        System.out.println(three); // DataOne@6d03e736
        System.out.println("A Count = " + three.count );

    }
}
