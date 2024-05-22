package study1.class4;

public class ClassStart1 {

    public static void main(String[] args) {
        // 생성자 없이 로직 구현
        MemberInit m1 = new MemberInit();
        m1.name = "유광진";
        m1.age = 27;
        m1.grade = 100;

        MemberInit m2 = new MemberInit();
        m2.name = "김광진";
        m2.age = 27;
        m2.grade = 100;
        
        MemberInit[] members = {m1, m2};

        for (MemberInit member : members) {
            System.out.println("이름은 :" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }

    }
}
