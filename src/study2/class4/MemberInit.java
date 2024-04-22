package study2.class4;

public class MemberInit {

    String name;
    int age;
    int grade;

    public void initMember(String name, int age, int grade) {
        /**
         * this 키워드 사용
         * 멤버 변수와 메서드이 매게변수(Parameter) 이름이 같은 경우 구분해주기 위함
         * this는 자기 자신의 인스턴스(객체)에 참조를 뜻한다.
         */
        this.name = name; // 오른쪽의 name은 매개변수에 접근
        this.age = age;
        this.grade = grade;

    }

}

