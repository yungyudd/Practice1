package generic;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Cat cat = new Cat("고양이", 50);
        Dog dog = new Dog("dog", 100);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog=" +findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat= "+findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal : " + findAnimal);
    }
}
