package study2.class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "유광진";
        s1.age = 27;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "김광진";
        s2.age = 17;
        s2.grade = 99;

        Student[] students = new Student[] {s1, s2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }
        System.out.println("==================================");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("학생 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
