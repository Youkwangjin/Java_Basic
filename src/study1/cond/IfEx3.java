package study1.cond;

public class IfEx3 {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매하였음으로 1000원 할인이 들어갑니다.");
        }

        if (price >= 1000 && age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하면 1000원을 더 할인을 받습니다.");
        }

    }
}
