package generic;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dog = new Box<>();
        Box<Cat> cat = new Box<>();

        dog.set(new Dog("ddff", 100));

        WildcardEx.printGenericV1(dog);
        WildcardEx.printWildcardV1(dog);

        WildcardEx.printGenericV2(dog);
        WildcardEx.printWildCardV2(dog);

        Dog dog1 = WildcardEx.printAndReturnGeneric(dog);
        Animal animal = WildcardEx.printAndReturnWildcard(dog);
    }
}
