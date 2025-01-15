package study4.interfaces;

public class KoreanMemberService implements MemberService {

    @Override
    public void greetMember(String name) {
        System.out.println("안녕하세요 = " + name);
    }
}
