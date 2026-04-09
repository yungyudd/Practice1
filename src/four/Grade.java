package four;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discount;

    Grade(int discount){
        this.discount =discount;
    }
    public int getDiscount(){
        return discount;
    }

    public int discount(int price){
        return price * discount/100;
    }

}
