package study5.exception.ex1;

public class ExceptionClass2 {

    public static void main(String[] args) {
        System.out.println("Result: " + test()); // test : 2

    }

    /*
        1. finally는 무조건적으로 실행이 되는 로직이기 때문에 try 로직에서 return을 한다해서 메서드가 바로 종료되지 않는다.
        2. 따라서 try 로직과 finally로직에 둘다 return을 하게 되면 최종적으로 finally로직에 있는 return 값이 반환된다.
     */

    static int test() {
        try {
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return 2;
        }
    }
}
