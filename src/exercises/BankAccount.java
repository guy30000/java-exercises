package org.launchcode.java.demos.java4python;

import java.util.Objects;

public class BankAccount {

    private int accountId;
    protected double balance;  //this changed in youtube (See checkingaccutn) 46:

    public BankAccount(int id, double balance) {
        this.accountId = id;
        this.balance = balance;
    }

    public BankAccount(int id) {
        this.accountId = id;
        this.balance = 0;
    }

    public double deposit(double amount) {
        if(amount > 0) {
            this.balance = this.balance + amount;
        }

        return this.balance;
    }

    public double withdraw(double amount) {
        if(amount > 0 && amount < this.balance) {
            this.balance = this.balance - amount;
        }

        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String toString() {
        return "Account: " + this.accountId + ", Balance: " + this.balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountId == that.accountId &&
                Double.compare(that.balance, balance) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountId, balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 1000);
        BankAccount account2 = new BankAccount(1);
        BankAccount account3 = account1;

        account2.deposit(1000);
        System.out.print(account1);
    }
}