package study5.generic.ex2;

import study5.generic.animal.Animal;
import study5.generic.animal.Cat;
import study5.generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("댕댕이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        System.out.println(dogBox.getValue().getName());
        Dog findDog = dogBox.getValue();
        System.out.println("findDog : " + findDog.getName());

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        System.out.println(catBox.getValue().getName());
        Cat findCat = catBox.getValue();
        System.out.println("findCat: " + findCat.getName());
    }
}
