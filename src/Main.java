public class Main {
    public static void main(String[] args) {
        Account regularAccount = new Account();
        regularAccount.put(1000);
        System.out.println("Баланс основного счёта после пополнения: " + regularAccount.getAmount());
        regularAccount.take(50);
        System.out.println("Баланс основного счёта после попытки вывода: " + regularAccount.getAmount() + "\n");

        CreditAccount creditAccount = new CreditAccount();
        creditAccount.put(1000);
        System.out.println("Баланс кредитного счёта после пополнения: " + creditAccount.getAmount());
        creditAccount.take(5000);
        System.out.println("Баланс кредитного счёта после попытки вывода: " + creditAccount.getAmount() + "\n");

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(1000);
        System.out.println("Баланс депозитного счёта после пополнения: " + depositAccount.getAmount());
        depositAccount.take(500);
        System.out.println("Баланс депозитного счёта после попытки вывода: " + depositAccount.getAmount());
    }
}
