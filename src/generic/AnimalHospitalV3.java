package generic;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }
    public void checkUp(){
        System.out.println("name: "+animal.getName());
        System.out.println("size: "+animal.getSize());
        animal.sound();
    }

    public T getBigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }


}
