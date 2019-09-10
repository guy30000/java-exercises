package exercises.hackerrank;

public class Practice {
    private double accountBalance;

    ///Getter n Setter
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Practice(double balance) {

        int test = 37;
        Math.round(test);
    }
// Rounding
    public static void main(String[] args) {
        int num = 52;
        if (num % 5 > 2.5) num = num + (5 - num % 5);
        System.out.println("Rounding up to nearest 5------(only up) " + num);

    }

}



