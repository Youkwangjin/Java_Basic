package study6.utils;

public class StringUtil {

    public static boolean equals(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }

        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }
}
