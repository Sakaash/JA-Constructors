package ExceptionHandling.BankBalance;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            BankAccount account1 = new BankAccount(1, "Bob", 10000);
            BankAccount account2 = new BankAccount(2, "Tom", 45997);
            bank.addAccount(account1);
            bank.addAccount(account2);

            bank.depositToAccount(1, 2000);
            bank.withdrawFromAccount(1, 1000);

            bank.withdrawFromAccount(2, 100000);
        } catch(InsufficientBalanceException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: "+e.getMessage());
        } catch(Exception e) {
            System.out.println("Unexpected Error: "+e.getMessage());
        }
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit must be greater than 0.");
        }
        balance+=amount;
        System.out.println("Deposit Success!");
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount<=0) {
            throw new IllegalArgumentException("Deposit must be greater than 0.");
        }
        if(balance<amount) {
            throw new InsufficientBalanceException("Lower balance than the amount trying to be withdrawn." );    
        }
        balance-=amount;
        System.out.println("Withdraw Success!");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {
    private HashMap<Integer, BankAccount> accounts;
    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            throw new IllegalArgumentException("Account already exists.");
        }
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account "+account.getAccountNumber()+" is created successfully.");
    }

    public BankAccount getAccount(int accountNumber) throws IllegalArgumentException {
        if(!accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account not found.");
        }
        return accounts.get(accountNumber);
    }
    
    public void depositToAccount(int accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFromAccount(int accountNumber, double amount) throws InsufficientBalanceException {
        BankAccount account = getAccount(accountNumber);
        account.withdraw(amount);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}