public class Account {
    private String number;
    private double balance;
    private String customer;
    private String email;
    private String phone;
    private double deposit;
    private double withdraw;

    // constructor method is a special method that is only called once, the exact name of the class
    public Account() {
        // if you try to create an object from this class, these parameters will be used (optional)
        // has to be the first line you call
        this("56789", 2.50, "Default Name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    // set field values in the constructor
    public Account(String number, double balance, String customer, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }

    public void setAccountNum(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNum() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdraw) {
        if(this.balance - withdraw < 0) {
            System.out.println("Only " + this.balance + " available");
        } else {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance = " + this.balance);
        }
    }

}
