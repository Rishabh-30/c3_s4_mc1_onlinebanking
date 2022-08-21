public abstract class  BankAccount {
    private int accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private String ifInternetBankingIsAvailable;
    private double totalBalance;
    private double availableBalance;
    private double rateOfInterest;

    public BankAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, String ifInternetBankingIsAvailable, double totalBalance, double availableBalance, double rateOfInterest) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.ifInternetBankingIsAvailable = ifInternetBankingIsAvailable;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getIfInternetBankingIsAvailable() {
        return ifInternetBankingIsAvailable;
    }

    public void setIfInternetBankingIsAvailable(String ifInternetBankingIsAvailable) {
        this.ifInternetBankingIsAvailable = ifInternetBankingIsAvailable;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
