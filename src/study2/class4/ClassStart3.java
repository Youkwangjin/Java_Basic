package study2.class4;

public class ClassStart3 {

    public static void main(String[] args) {

        MemberInit m1 = new MemberInit();
        m1.initMember("유광진", 27, 100);

        MemberInit m2 = new MemberInit();
        m2.initMember("김광진", 47, 800);

        MemberInit[] members = {m1, m2};

        for (MemberInit member : members) {
            System.out.println("이름은:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
}
