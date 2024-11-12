import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BankAccount {
    private static int nextAccountNumber = 1;
    public int accountNumber;
    public String owner;
    public float balance;
    private ArrayList<HashMap<String, Object>> history;

    BankAccount(String name){
        this.accountNumber = nextAccountNumber++;
        this.owner = name;
        this.balance = 0.0f;
        this.history = new ArrayList<>();
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Owner: " + this.owner);
        System.out.println("Balance: $" + this.balance);

    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("deposit", amount);
            System.out.println("Depósito de $" + amount + " realizado con éxito.");
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Retiro", amount);
            System.out.println("Retiro de $" + amount + " realizado con éxito.");
        } else if (amount > balance) {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    private void addTransaction (String type, float amount) {
        HashMap<String, Object> transaction = new HashMap<>();
        transaction.put("type", type);
        transaction.put("amount", amount);
        history.add(transaction);
    }
}


public class Ejercicio5 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice");
        BankAccount account2 = new BankAccount("Bob");

        account1.showAccountDetails();
        account2.showAccountDetails();
    }
}
