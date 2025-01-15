package study4.interfaces;

public class EnglishMemberService implements MemberService {

    @Override
    public void greetMember(String name) {
        System.out.println("hello update = " + name);
    }
}
