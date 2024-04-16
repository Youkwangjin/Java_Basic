package study2.class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // Student 타입의 객체를 new 통해 메모리에 생성
        // 생성된 메모리에 접근하기 위한 참조값도 같이 작성 (여기서는 s1)
        Student s1 = new Student();
        s1.name = "유광진";
        s1.age = 27;
        s1.grade = 90;

        // 객체의 접근하기 위해 .(점, dot) 키워드 사용
        System.out.println("학생 : " + s1.name + " 나이 : " + s1.age + " 성적 : " + s1.grade);
    }
}
