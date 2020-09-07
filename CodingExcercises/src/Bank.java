public class Bank {
    private int AccountNumber;
    private int Balance;
    private String CustomerName;
    private String Email;
    private int PhoneNumber;

    public Bank() {
        this(123,32,"Manisha","manisha53@gmail.com",96199299);
    }

    public Bank(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        AccountNumber = accountNumber;
        Balance = balance;
        CustomerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;

    }



    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.AccountNumber;
    }

    public int getBalance() {
        return this.Balance;
    }

    public int getPhoneNumber() {
        return this.PhoneNumber;
    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public String getEmail() {
        return this.Email;
    }

    public void Deposit(int Deposit) {
        this.Balance = this.Balance + Deposit;
        System.out.println("Deposit Successful . New Balance = " + getBalance());
    }


    public void Withdraw(int Withdraw) {
        if (Withdraw >= this.Balance) {
            System.out.println("Insufficient Funds" + " Funds available to withdraw  = " + getBalance() );
        }
else {
            this.Balance = this.Balance - Withdraw;
            System.out.println("Withdraw Successfull . New Balance = " + getBalance());
        }
    }
}
