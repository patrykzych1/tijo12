package pl.edu.pwsztar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// TODO: Prosze dokonczyc implementacje oraz testy jednostkowe
// TODO: Prosze nie zmieniac nazw metod - wszystkie inne chwyty dozwolone
// TODO: (prosze jedynie trzymac sie dokumentacji zawartej w interfejsie BankOperation)
class Bank implements BankOperation {

    private static int accountNumber = 0;
    private List<Account> accounts = new ArrayList<Account>();
    public int createAccount() {
        accounts.add(new Account(++accountNumber, 0));
        return accountNumber;
    }

    public void createSampleAccounts() {
        accounts.add(new Account(++accountNumber, 200));
        accounts.add(new Account(++accountNumber, 370));
        accounts.add(new Account(++accountNumber, 123));
        accounts.add(new Account(++accountNumber, 650));
    }

    public int deleteAccount(int accountNumber) {
        return 0;
    }

    public boolean deposit(int accountNumber, int amount) {
        return false;
    }

    public boolean withdraw(int accountNumber, int amount) {
        return false;
    }

    public boolean transfer(int fromAccount, int toAccount, int amount) {
        return false;
    }

    public int accountBalance(int accountNumber) {
        return 0;
    }

    public int sumAccountsBalance() {
        return 0;
    }
}
