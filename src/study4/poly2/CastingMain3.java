package study4.poly2;

public class CastingMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal1 = (Animal) dog;
        Animal animal2 = dog; // 업 캐스팅은 생략이 가능하고 자바에서는 권장한다.

        animal1.animalMethod();
        animal2.animalMethod();
    }
}
