package encapsulation;

public class Account {

    // make properties private
    private int accountNo;
    private String fullname;
    private double amount;

    // set properties
    public int getAccountNo() {
        return accountNo;
    }

    // get properties - 'this' refers to class property
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
