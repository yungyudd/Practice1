package variable;

import java.awt.*;
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = 1;
       String[] productNames = new String[max];
       int[] productPrices = new int[max];
       int productCount = 0;

       while(true) {
           System.out.print("1.상품 등록 2.상품 목록 3. 종료\n 메뉴 선택: ");
           int menu = scanner.nextInt();
           scanner.nextLine();
           if(menu == 1){
               if(productCount>=max){
                   System.out.println("상품 등록 할수 x");
                   continue;
               }
               System.out.print("name: ");
               productNames[productCount] = scanner.nextLine();
               System.out.print("price: ");
               productPrices[productCount] = scanner.nextInt();
               productCount++;
           }
           else if(menu == 2){
               if(productCount==0){
                   System.out.println("등록된 상품x");
                   continue;
               }
               for(int i=0; i<productCount; i++) {
                   System.out.println("name: "+productNames[i]+", price: "+productPrices[i]+"원");
               }
           }else if(menu == 3){
               System.out.println("종료");
               break;
           }
           else {
               System.out.println("잘못 누름");
           }
       }
    }
}
