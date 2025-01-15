package study4.interfaces;

/*
 * 클래스가 반드시 구현해야 하는 메서드들의 집합
 * 구현 세부 사항은 없고, 오직 메서드 선언만 포함
 * 동일한 인터페이스를 통해 다양한 구현을 제공할 수 있다.
 */
public interface MemberService {

    void greetMember (String name);
}
