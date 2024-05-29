package study5.generic.ex2;

import study5.generic.animal.Animal;
import study5.generic.animal.Cat;
import study5.generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);
        
        // 제네릭 타입 사용 (선언부에는 타입 설정을 해줘야해서 생략이 불가능하다.)
        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog: " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat: " + findCat);
    }
}
