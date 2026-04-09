package variable;

public class AmountMain {
    public static void main(String[] args) {

        Account ac = new Account();
        ac.balance = 20000;

        ac.deposit(20000);
        ac.withdraw(2000);
        System.out.println("잔고: "+ac.balance);
    }

}
