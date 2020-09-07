public class ViPCustomer {
    private String name ;
    private int CreditLimit;
    private String EmailAddress ;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public ViPCustomer(String name) {
        this(name,0,"Default");
    }

    public ViPCustomer(String name, int creditLimit) {
        this(name,creditLimit,"Default");
    }

    public ViPCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.CreditLimit = creditLimit;
        this.EmailAddress = emailAddress;
    }
}
