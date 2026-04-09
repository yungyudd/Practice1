package generic;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp(){
        animal.toString();
    }
}
