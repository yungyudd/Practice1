package variable;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1.입금 2.출금 3.잔액 확인 4.종료");
            System.out.println("-----------------------------------------");

            System.out.println("선택: ");
            int choice = scanner.nextInt();
            int amount;;
            switch (choice){
                case 1 :
                    System.out.print("입금액 입력: ");
                    amount = scanner.nextInt();
                    balance = deposit(amount, balance);
                break;
                case 2 :
                    System.out.println("출금액 입력: ");
                    amount = scanner.nextInt();
                    balance = withdraw(amount, balance);
                    break;

                case 3:
                    System.out.println("현재 잔액: "+balance);
                    break;

                case 4:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("잘못 누름");
            }
        }
    }
    public static int deposit(int amount, int balance){
        balance += amount;
        System.out.println(amount+"입금 잔액: "+balance);
        return balance;
    }
    public static int withdraw(int amount, int balance){
        if(balance>=amount){
            balance -= amount;
            System.out.println("출금 남은 금액"+balance);
        }
        else{
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
