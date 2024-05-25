package study4.poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        // 부모타입은 자식 타입을 참조할 수 있다.
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animals) {
            extracted(animal);

        }
    }

    private static void extracted(Animal animal) {
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }
}
