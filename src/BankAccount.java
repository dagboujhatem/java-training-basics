public class BankAccount {
    public static int numberOfBankAccount = 0;
    private double balance;
    private String owner;
    private boolean isClosed;

    // Constructeur par défaut
    public BankAccount() {
        this.isClosed = false;
        numberOfBankAccount++;
    }

    // Constructeur avec paramétres
    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.isClosed = false;
        numberOfBankAccount++;
    }

    // Constructeur de copie
    public BankAccount(BankAccount bankAccount) {
        this(bankAccount.getBalance(), bankAccount.getOwner()); // appelle à un autre contructeur
    }

    public static void showNumberOfAccount() {
        System.out.println("Le nombre des comptes est : " + numberOfBankAccount);
    }

    public void init(double balance) {
        if (balance < 0)
            balance = 0;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0 && !isClosed)
            this.balance += balance;
    }

    // getters & setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
