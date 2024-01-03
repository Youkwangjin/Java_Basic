package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("홍길동", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("전길동", 17, 88);

        MemberInit[] members = {member1, member2};
        for (MemberInit m : members) {
            System.out.println("이름:" + m.name + " 나이:" + m.age + " 성적:" + m.grade);
        }
    }
}
