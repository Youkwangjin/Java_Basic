package extends1.overriding;

import extends1.ex3.Car;

public class ElectricCar extends Car { // 자식 클래스

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {
        System.out.println("충전합니다.");
    }
}
