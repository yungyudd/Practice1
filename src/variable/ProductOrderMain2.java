package variable;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사용자 입력: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] order = new ProductOrder[count];

        for(int i=0; i<count; i++) {
            System.out.println((i+1)+"번째 주문 정보");

            System.out.println("상품 이름");
            String productName = scanner.nextLine();

            System.out.println("상품 가격");
            int price = scanner.nextInt();

            System.out.println("상품 수량");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            order[i] = createOrder(productName, price, quantity);
        }
        printOrders(order);
        int sum = getTotalAmount(order);
        System.out.println("금액: "+sum);

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder pd = new ProductOrder();
        pd.productName = productName;
        pd.price = price;
        pd.quantity = quantity;
        return pd;
    }
    static void printOrders(ProductOrder[] orders){
        for(ProductOrder p: orders){
            System.out.println("name: "+p.productName+", price: "+p.price+", quantity: "+ p.quantity);
        }

    }
    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for(ProductOrder p: orders){
            sum += p.price*p.quantity;
        }
        return sum;
    }
}
