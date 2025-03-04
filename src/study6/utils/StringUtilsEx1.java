package study6.utils;

public class StringUtilsEx1 {

    String name = null;
    String name2 = "you";

    public static void main(String[] args) {
        StringUtilsEx1 utils = new StringUtilsEx1();

        /*
            1. 문자열 비교시 name이 null일 경우 NPE가 발생한다.
         */
        if (utils.name.equals(utils.name2)) {
            System.out.println("문자열이 같습니다.");
        } else {
            System.out.println("문자열이 같지 않습니다.");
        }
    }
}