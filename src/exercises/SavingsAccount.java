package exercises;

import org.launchcode.java.demos.java4python.BankAccount;

import java.util.ArrayList; //this how page made about 50 minutes

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accountId, double balance, double interestRate){
        super(accountId,balance);
        this.interestRate = interestRate;

    }

public void compoundsInterest()  {
        this.balance = this.balance + (this.balance * this.interestRate);
}

public static void main(String[] args) {
    BankAccount base = new BankAccount(1, 1000);
    CheckingAccount checking = new CheckingAccount(2, 200, 4);
    SavingsAccount savings = new SavingsAccount(2, 3000, .01);

    ArrayList<BankAccount> accounts = new ArrayList<>();
    accounts.add(base);
    accounts.add(checking);
    accounts.add(savings);

    for (int i = 0; i < accounts.size(); i++) { //55
        BankAccount b = accounts.get(i);
        b.deposit(500);
        //CheckingAccount c = (CheckingAccount)b;  //57 This you wold want to be sure that it is a checking accoung
    }
}

}
