package study3;

public class DataThree {

    public String name;
    /**
     * 정적변수, static 변수, 클래스 변수라 부른다.
     * static이 붙은 멤버 변수 count는 메서드 영역에서 관리한다.
     */
    public static int count;

    public DataThree(String name) {
        this.name = name;
        count++;
    }
}
