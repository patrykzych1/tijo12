package pl.edu.pwsztar;

import java.util.ArrayList;
import java.util.List;

class Bank implements BankOperation {
    private static int accountNumber = 0;

    private List<Account> accounts = new ArrayList<Account>();
    public int createAccount() {
        accounts.add(new Account(++accountNumber, 0));
        return accountNumber;
    }

    public void createSampleAccounts() {
        accountNumber = 0;
        accounts.add(new Account(++accountNumber, 200));
        accounts.add(new Account(++accountNumber, 370));
        accounts.add(new Account(++accountNumber, 123));
        accounts.add(new Account(++accountNumber, 650));
    }

    public int deleteAccount(int accountNumber) {
        for(Account a: accounts){
            if(a.getNumber() == accountNumber){
                int balance = a.getBalance();
                accounts.remove(a);
                Bank.accountNumber--;
                return balance;
            }
        }
        return ACCOUNT_NOT_EXISTS;
    }

    public boolean deposit(int accountNumber, int amount) {
        if(amount < 0){
            return false;
        }

        for(Account a: accounts){
            if(a.getNumber() == accountNumber){
                a.setBalance(a.getBalance() + amount);
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(int accountNumber, int amount) {
        if(amount < 0) {
            return false;
        }

        for(Account a: accounts) {
            if(a.getNumber() == accountNumber) {
                if(a.getBalance() < amount){
                    return false;
                }

                a.setBalance(a.getBalance() - amount);
                return true;
            }
        }

        return false;
    }

    public boolean transfer(int fromAccount, int toAccount, int amount) {
        if(amount < 0 || fromAccount == toAccount) {
            return false;
        }

        Account acc1 = null;
        Account acc2 = null;

        for(Account a: accounts) {
            if(a.getNumber() == fromAccount){
                if(a.getBalance() < amount) {
                    return false;
                }
                acc1 = a;
            } else if(a.getNumber() == toAccount){
                acc2 = a;
            }
        }
        if(acc1 == null || acc2 == null) {
            return false;
        } else {
            acc1.setBalance(acc1.getBalance() - amount);
            acc2.setBalance(acc2.getBalance() + amount);
            return true;
        }

    }

    public int accountBalance(int accountNumber) {
        for(Account a: accounts){
            if(a.getNumber() == accountNumber) {
                return a.getBalance();
            }
        }

        return ACCOUNT_NOT_EXISTS;
    }

    public int sumAccountsBalance() {
        int sum = 0;
        for(Account a: accounts) {
            sum += a.getBalance();
        }

        return sum;
    }
}
