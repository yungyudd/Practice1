package overriding;

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();


        soundAnimal(cat);
        soundAnimal(dog);

    }

    // 동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
