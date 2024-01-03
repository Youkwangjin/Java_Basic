package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "홍길동", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "전길동", 17, 88);

        MemberInit[] members = {member1, member2};
        for (MemberInit m : members) {
            System.out.println("이름:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }
    }
    static void initMember(MemberInit member1, String name, int age, int grade) {
        member1.name = name;
        member1.age = age;
        member1.grade = grade;
    }
}
