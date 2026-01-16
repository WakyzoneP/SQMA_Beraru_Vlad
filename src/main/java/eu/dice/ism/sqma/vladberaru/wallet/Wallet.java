package eu.dice.ism.sqma.vladberaru.wallet;

public class Wallet {

    private double balance;
    private String pin;

    public Wallet() {
        this.balance = 0.0;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public void setPin(String pin) {
        if (pin == null || pin.length() != 4) {
            throw new IllegalArgumentException("PIN must be exactly 4 digits");
        }
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }
}
