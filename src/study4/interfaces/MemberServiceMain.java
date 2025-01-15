package study4.interfaces;

public class MemberServiceMain {
    
    public static void main(String[] args) {
        MemberService memberService = new EnglishMemberService();
        memberService.greetMember("John");

    }
}
