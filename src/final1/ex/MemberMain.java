package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "You");
        member.print();
        member.changeData("lee");
        member.print();
    }
}
