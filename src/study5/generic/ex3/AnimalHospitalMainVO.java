package study5.generic.ex3;

import study5.generic.animal.Cat;
import study5.generic.animal.Dog;

public class AnimalHospitalMainVO {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 300);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 : 개병원에 고양이 전달
        // dogHospital.set(cat); 다른 타입을 입력하면 컴파일 오류가 발생한다.

        // 문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + bigger);
    }
}