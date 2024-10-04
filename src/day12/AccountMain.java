package day12;

public class AccountMain {
    public static void main(String[] args) {
        Account acc1 = new Account();

        // using setters
        acc1.setAccountNo(199);
        acc1.setAmount(150);
        acc1.setFullname("Jane Khan");

        // using getters
        System.out.println(acc1.getAccountNo());
        System.out.println(acc1.getAmount());
        System.out.println(acc1.getFullname());
    }
}
