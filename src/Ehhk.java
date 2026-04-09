import java.util.Scanner;

public class Ehhk {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalCost = 0;
        while(true) {
            System.out.println("1: 상품 입력,2: 결제,3: 프로그램 종료");
            int option = input.nextInt();
            if(option == 1) {
                input.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String name = input.nextLine();
                System.out.print("가격: ");
                int price = input.nextInt();
                System.out.print("구매 수량: ");
                int qu = input.nextInt();
                totalCost = price * qu;

                
            }

        }

    }
}
