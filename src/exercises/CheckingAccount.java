package exercises;
import org.launchcode.java.demos.java4python.BankAccount;
//Lesson 7 lecture
// https://www.youtube.com/watch?v=LYixVnOpDlY

public class CheckingAccount extends BankAccount {

    private double fee;

    public CheckingAccount (int id, double balance, double fee) { //42:00 part of it
        super(id, balance);
        this.fee = fee;


    }

    public void chargeFees() {
        this.balance = this.balance - this.fee;  //
    }

    @Override //67
    public double withdraw(double amount) {
        //uper.withdraw() //69 another example of a super that isnt needed.
        if (amount > 0 && amount  < this.balance + 20) {
            this.balance = this.balance - amount;
        }
        return this.balance;

//something else about (int)this.balance at end  of video 73
    }
}