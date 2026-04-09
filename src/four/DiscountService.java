package four;

public class DiscountService {
    public int discount(Grade grade, int price){
        return price * grade.getDiscount() /100;
    }
}
