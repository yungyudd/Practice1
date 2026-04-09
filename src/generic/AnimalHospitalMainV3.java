package generic;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("ddd",200);
        Cat cat = new Cat("ndndn", 100);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("박멍멍",100));
        System.out.println("bigger = "+biggerDog);
    }
}
