package ru.netology.javabasic.bankAccounts;

public abstract class Account {
    protected int amount;

    public abstract boolean pay(int amount);

    public boolean transfer(Account account, int amount) {
        if ((this.amount >= amount) && (account.addMoney(amount))) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean addMoney(int amount) {
        this.amount += amount;
        return true;
    }
}
