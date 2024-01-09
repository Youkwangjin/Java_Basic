package ploy.ex4;


public class AbstrctMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성 불가!
        // AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        moveAnimal(dog);
        soundAnimal(cat);
        moveAnimal(cat);
        soundAnimal(cow);
        moveAnimal(cat);

    }

    // 동물이 추가되어도 변하지 않는 로직
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}
