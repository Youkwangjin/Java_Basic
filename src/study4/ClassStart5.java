package study4;

public class ClassStart5 {
    public static void main(String[] args) {

        DataThree one = new DataThree("A");
        System.out.println(one); // DataOne@4eec7777
        System.out.println("A Count = " + DataThree.count ); // DataThree 클래스에 직접 (.dot) 접근

        DataThree two = new DataThree("A");
        System.out.println(two); // DataOne@4dd8dc3
        System.out.println("A Count = " + DataThree.count );

        DataThree three = new DataThree("A");
        System.out.println(three); // DataOne@6d03e736
        System.out.println("A Count = " + DataThree.count );


    }
}
