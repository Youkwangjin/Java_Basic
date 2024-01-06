package static1;

public class Data3 {
    public String name; // 멤버 변수 (해당 클래스에 소속된 멤버이기 때문이다.)
    /*
        멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라고 한다.
        또한 메서드영역에 있는 static 영역에 접근하게 된다.
     */
    public static int count; // 중복 불가

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
