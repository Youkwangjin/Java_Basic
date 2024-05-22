package study1.class4;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    /**
     * 생성자는 클래스 이름과 같아야한다.
     * 생성자는 반환 타입이 없다.
     */

    MemberConstruct(String name, int age) {
        this(name, age, 50); // 생성자 내부에서 자신의 생성자 호출 (중복 방지)
        System.out.println("생성사 호출 name = " + name + " age = " + age + " grade = " + grade);
    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성사 호출 name = " + name + " age = " + age + " grade = " + grade);
    }
}
