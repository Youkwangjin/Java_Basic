package study1.class2;

public class ClassStart5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        initStudent(s1, "유광진", 27, 90);

        Student s2 = new Student();
        initStudent(s2, "김광진", 24, 99);

        // 참조값을 복사해서 넘긴다.
        printStudent(s1);
        printStudent(s2);

    }

    /**
     *
     * @param student 객체 참조값을 담고있다.
     * @param name  외부에서 설정한 이름 값을 담고 있다. (ex. "유광진", "김광진")
     * @param age   외부에서 설정한 이름 값을 담고 있다. (ex. 27, 24)
     * @param grade 외부에서 설정한 이름 값을 담고 있다. (ex. 90, 99)
     */
    static void initStudent(Student student, String name, int age, int grade) {
        /**
         *  student.name = name; 여기서 student은 앞서 객체 생성할 때 참조변수의 참초값을 가지고 있다.
         *  name은 외부에서 설정한 이름 값
         */
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    /**
     * 메서드 호출 시 student 라는 새로운 참조 변수가 생성되지만,
     * 이 변수는 원본 객체인 s1이 참조하는 객체와 동일한 객체를 가리키는 참조값을 복사하여 받는다.
     */
    static void printStudent(Student student) {
        System.out.println("학생 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
