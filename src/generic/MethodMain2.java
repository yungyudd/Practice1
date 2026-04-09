package generic;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("ddd", 100);
        Cat cat = new Cat("Ccc", 200);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);
        Dog target = new Dog("DD", 300);
        Dog bigger = AnimalMethod.getBigger(target,dog);
        System.out.println("bigger is = "+bigger);

    }
}
