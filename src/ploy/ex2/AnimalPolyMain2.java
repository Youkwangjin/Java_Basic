package ploy.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        
        // 동물이 추가되어도 변하지 않는 로직
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가되어도 변하지 않는 로직
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}