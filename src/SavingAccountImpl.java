public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(254623,"20/05/12","self","yes",25400.0,1500000.20,5.0,5.2);
        recurringDepositAccount recurringDepositAccount = new recurringDepositAccount(546214,"02/02/12","self","yes",4512.20,50000.5,4.5,"02/04/15",2.2);
                savingAccount.display();
                savingAccount.deposit(500);
                savingAccount.withdraw(500);
        System.out.println(" ");
        recurringDepositAccount.display();
    }
}
