package variable;

public class Account {
    int balance;



    void deposit(int amount){
        balance += amount;
        System.out.println(+amount+"원 입금 잔액: "+balance);
    }
    void withdraw(int amount){
        if(balance>=amount){
            balance -=amount;
            System.out.println(amount+"원 출금 잔액: "+balance);
        }
        else{
            System.out.println(amount+"출금 시도, 잔액이 부족합니다.");
        }
    }
}
