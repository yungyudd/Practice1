package generic;

public class AnimalMethod {

    public static <T extends Animal> void checkUp(T t){
        System.out.println("name= "+t.getName());
        System.out.println("size= "+t.getSize());
        t.sound();
    }
    public static <T extends Animal> T getBigger(T t1, T t2){
        return t1.getSize() > t2.getSize() ? t1: t2;
    }
}
