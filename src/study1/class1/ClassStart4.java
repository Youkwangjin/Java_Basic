package study1.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "유광진";
        s1.age = 27;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "김광진";
        s2.age = 17;
        s2.grade = 99;

        Student[] students = new Student[2]; // Student 변수를 2개를 보관할 수 있는 사이즈 2의 배열을 만든다.

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다. ex) s1 = x001
        students[0] = s1; // students[0] = x001;
        students[1] = s2;

        System.out.println("학생 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("학생 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

    }
}
