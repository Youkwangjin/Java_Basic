package study1.class2;

public class ClassStart6 {
    public static void main(String[] args) {
        Student s1 = createStudent("유광진", 27, 90);
        Student s2 = createStudent("김광진", 17, 80);

        // 참조값을 복사해서 넘긴다.
        printStudent(s1);
        printStudent(s2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student s1 = new Student();
        s1.name = name;
        s1.age = age;
        s1.grade = grade;
        return s1;
    }

    /**
     * 메서드 호출 시 student 라는 새로운 참조 변수가 생성되지만,
     * 이 변수는 원본 객체인 s1이 참조하는 객체와 동일한 객체를 가리키는 참조값을 복사하여 받는다.
     */
    static void printStudent(Student student) {
        System.out.println("학생 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
