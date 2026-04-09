package variable;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder pro = new ProductOrder();
        pro.productName = "dd";
        pro.price = 1100;
        pro.quantity = 2;

        ProductOrder pro2 = new ProductOrder();
        pro2.productName = "ss";
        pro2.price = 3000;
        pro2.quantity = 5;


        ProductOrder[] product = new ProductOrder[2];

        product[0] = pro;
        product[1] = pro2;

        int sum = 0;
        for(ProductOrder p: product){
            System.out.println("name: "+p.productName+", price: "+p.price+", quantity: "+ p.quantity);
            sum += p.price*p.quantity;
        }
        System.out.println("결제 금액: "+sum);

    }
}
