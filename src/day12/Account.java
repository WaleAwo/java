package day12;

public class Account {
    // Encapsulation

    // make properties private
    private int accountNo;
    private String fullname;
    private double amount;

    // set properties
    public int getAccountNo() {
        return accountNo;
    }

    // get properties
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo; // 'this' refers to class property
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
