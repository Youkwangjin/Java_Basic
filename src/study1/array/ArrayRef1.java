package study1.array;

public class ArrayRef1 {

    public static void main(String[] args) {

        int[] students; // 배열 변수 선언 (배열을 생성하고 나면 자바는 어딘가에 있는 이 배열에 접근할 수 있는 참조값을 반환한다.)
        students = new int[5];

        /*
            int[] students = new int[5];
         */
        // 변수 값 대입 (변수는 0번 부터 시작한다.)

        System.out.println(students); // [I@3fee733d
        System.out.println(students.length); // 5 (0, 1, 2, 3, 4) -> 배열의 위치를 나타내는 숫자를 인덱스라고 한다.
        System.out.println();

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        // students[5] = 40; Index 5 out of bounds for length 5

        System.out.println("students1 = " + students[0]);
        System.out.println("students2 = " + students[1]);
        System.out.println("students3 = " + students[2]);
        System.out.println("students4 = " + students[3]);
        System.out.println("students5 = " + students[4]);
    }
}
