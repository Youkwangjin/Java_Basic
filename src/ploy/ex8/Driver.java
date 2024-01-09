package ploy.ex8;

public class Driver { // Closed for modification
    private Car car;  // 멤버 변수로 Car 인터페이스를 가진다.

    public void setCar(Car car) { // 멤버변수에 자동차를 설정(set)한다.
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
