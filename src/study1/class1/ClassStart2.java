package study1.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        /*
            1. 변수명을 동일하게 만들어 배열을 사용
         */
        String [] students = {"학생1", "학생2"};
        int [] age = {12, 34};
        int [] grade = {5, 6};

        System.out.println("학생 : " + students[0] + " 나이: " + age[0] + " 성적: " + grade[0]);
        System.out.println("학생 : " + students[1] + " 나이: " + age[1] + " 성적: " + grade[1]);

        /*
            1.배열의 길이는 배열에 저장된 요소의 개수를 나타낸다.
            2. 즉, 배열의 인덱스가 0부터 시작하기 때문에 0, 1 -> 총 2
         */
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 : " + students[i] + " 나이 : " + age[i] + " 성적 : " + grade[i]);
        }
    }
}
