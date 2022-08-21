public class recurringDepositAccount extends  BankAccount{
    private String closingDate;
    private double duration;

    public recurringDepositAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, String ifInternetBankingIsAvailable, double totalBalance, double availableBalance, double rateOfInterest, String closingDate, double duration) {
        super(accountNumber, accountOpeningDate, modeOfOperation, ifInternetBankingIsAvailable, totalBalance, availableBalance, rateOfInterest);
        this.closingDate = closingDate;
        this.duration = duration;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void display(){
        System.out.println("getAccountNumber() = " + getAccountNumber());
        System.out.println("getAccountOpeningDate() = " + getAccountOpeningDate());
        System.out.println("getModeOfOperation() = " + getModeOfOperation());
        System.out.println("getIfInternetBankingIsAvailable() = " + getIfInternetBankingIsAvailable());
        System.out.println("getTotalBalance() = " + getTotalBalance());
        System.out.println("getAvailableBalance() = " + getAvailableBalance());
        System.out.println("getRateOfInterest() = " + getRateOfInterest());
        System.out.println("getClosingDate() = " + getClosingDate());
        System.out.println("getDuration() = " + getDuration());
    }
}
