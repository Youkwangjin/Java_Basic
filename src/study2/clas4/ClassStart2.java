package study2.clas4;

public class ClassStart2 {

    public static void main(String[] args) {
        // 생성자 없이 로직 구현
        MemberInit m1 = new MemberInit();
        initMember(m1, "유광진", 27, 100);

        MemberInit m2 = new MemberInit();
        initMember(m2, "김광진", 17, 800);

        MemberInit[] members = {m1, m2};

        for (MemberInit member : members) {
            System.out.println("이름은:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;

    }
}
