package study1.class4;

public class ClassStart5 {

    public static void main(String[] args) {

        MemberConstruct m1 = new MemberConstruct("유광진", 28, 100);
        MemberConstruct m2 = new MemberConstruct("김광진", 13);

        MemberConstruct[] memberConstruct = {m1, m2};
        for (MemberConstruct m : memberConstruct) {
            System.out.println("이름은:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }

    }
}
