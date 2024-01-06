package static2;

public class DecoUtil2 {
    /*
        1. 메서드 앞에 static이 붙여있으니 정적 메서드 이다.
        2. 이 정적 메서드는 정적 변수 처럼 인스턴스 생성 없이 클래스 명을 통해서 호출할 수 있다.
        3. static 앞에 있으면 클래스 소속인걸 기억하자!
     */
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
