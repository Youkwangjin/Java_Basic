package construct;

public class MemberConstructMain2 {
    public static void main(String[] args) {
        /*
            객체를 생성하는 new MemberConstruct() 동시에 () => 생성자를 불러와라 라는 뜻
         */
        MemberConstruct construct1 = new MemberConstruct("홍길동", 15, 90);
        MemberConstruct construct2 = new MemberConstruct("전길동", 18);

        MemberConstruct[] constructs = {construct1, construct2};

        for (MemberConstruct c : constructs) {
            System.out.println("이름:" + c.name + " 나이:" + c.age + " 성적:" + c.grade);

        }

    }
}
