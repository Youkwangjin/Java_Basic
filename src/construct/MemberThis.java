package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        /*
            앞에 this 는 생략되어 있다. 왜? 메서드의 파라미터 변수명과 멤버변수의 변수명이 다르기 때문이다.
            만약 같게 설정을 해주면 자바는 구분하지 못하기 때문에 this 로 구분지어줘야 한다.
         */
        nameField = nameParameter;
    }
}
