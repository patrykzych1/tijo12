package pl.edu.pwsztar;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int number;
    private int balance;

    public Account(int number, int balance){
        this.number = number;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }


}
