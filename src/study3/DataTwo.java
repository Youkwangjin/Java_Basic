package study3;

public class DataTwo {

    public String name;

    /**
     * DataTwo 생성자는 Counter 인스턴스를 매게변수로 받기 때문에
     * Counter 이라는 참조값을 알고 있다.
     * 따라서 인스턴스 변수를 공용으로 사용할 수 있다,
     */
    public DataTwo(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }

}
