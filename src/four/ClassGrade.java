package four;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discount;

    private ClassGrade(int discount){
        this.discount = discount;
    }
    public int getDiscount(){
        return discount;
    }
}
