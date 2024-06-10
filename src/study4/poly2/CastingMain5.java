package study4.poly2;

public class CastingMain5 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        call(animal1);
        Animal animal2 = new Dog();
        call(animal2);
    }

    private static void call(Animal animal) {
        // animal 변수는 Dog 인스턴스로 부터 생성된게 맞다면
        if (animal instanceof Dog) {
            System.out.println("Dog 인스턴스가 맞다.");
            Dog dog = (Dog) animal;
            dog.dogMethod();
        } else {
            System.out.println("Dog 인스턴스가 아니다.");
        }
    }
}
