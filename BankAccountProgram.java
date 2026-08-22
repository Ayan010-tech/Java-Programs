class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;
    static int accountCount = 0;
    static final String bankName = "State Bank";

    BankAccount(String accountHolder,String accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(){
        this.accountHolder = accountHolder;
    }
    public String getNumber(){
        return accountNumber;
    }
    public void setNumber(){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }
}

public class BankAccountProgram {
        public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Ravi", "ACC101", 25000);

        BankAccount a2 = new BankAccount("Sneha", "ACC102", 40000);

        System.out.println(a1.getAccountHolder());
        System.out.println("Balance: " + a2.getBalance());
        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Total Accounts: "
                           + BankAccount.accountCount);
    }

    }

