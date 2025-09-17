package study1.array;

public class ArrayRef3 {

    public static void main(String[] args) {

        int[] students = new int[]{90, 80, 70, 60, 50};
        // int[] students = {90, 80, 70, 60, 50};


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        /*
            for (int student : students) {
                System.out.println(student);
            }
         */
    }
}
