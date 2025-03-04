package study6.utils;

public class StringUtilsEx2 {

    String name = null;
    String name2 = "kwang";

    public static void main(String[] args) {
        StringUtilsEx2 util = new StringUtilsEx2();

        if (StringUtil.equals(util.name, util.name2)) {
            System.out.println("문자열이 같습니다.");
        } else {
            System.out.println("문자열이 같지 않습니다.");
        }
    }
}
