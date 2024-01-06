package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // 추가 (인스턴스를 통한 접근, 하지만 실제로 인스턴스에 있는걸 사용하는것이 아닌 인스턴스에 가보니 static 영역인걸 확인하고 다시 가는 작업)
        // 따라서 정적 변수의 경우는 인스턴스를 통한 접근은 추천하지 않는다.
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);

    }
}
