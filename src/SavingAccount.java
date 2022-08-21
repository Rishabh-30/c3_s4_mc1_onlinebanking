public class SavingAccount extends BankAccount{
    private double rateOfInterest;

    public SavingAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, String ifInternetBankingIsAvailable, double totalBalance, double availableBalance, double rateOfInterest, double rateOfInterest1) {
        super(accountNumber, accountOpeningDate, modeOfOperation, ifInternetBankingIsAvailable, totalBalance, availableBalance, rateOfInterest);
        this.rateOfInterest = rateOfInterest1;
    }

    @Override
    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public  double deposit(double debitAmount){
        double totalBalance = getTotalBalance()+ debitAmount;
        System.out.println("Available amount after debit : " + totalBalance);
        return totalBalance;
    }

    public double withdraw(double withdrawAmount){
        double balanceAfterWithdraw = 0;
        if (getTotalBalance()>withdrawAmount){
            balanceAfterWithdraw = getTotalBalance()-withdrawAmount;
            System.out.println("balanceAfterWithdraw = " + balanceAfterWithdraw);

        }
        return balanceAfterWithdraw;
    }

    public  void display(){

        System.out.println("Details of Saving Account");
        System.out.println("Account Number = " + getAccountNumber());
        System.out.println("Account Opening date = " + getAccountOpeningDate());
        System.out.println("Mode of Operation = " + getModeOfOperation());
        System.out.println("Internet Banking Is Available or Not = " + getIfInternetBankingIsAvailable());
        System.out.println("Total balance = " + getTotalBalance());
        System.out.println("Available Balance = " + getAvailableBalance());
        System.out.println("Rate of Interest = " + getRateOfInterest());

    }


}
