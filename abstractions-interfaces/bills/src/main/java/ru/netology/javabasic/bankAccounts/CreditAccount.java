package ru.netology.javabasic.bankAccounts;

public class CreditAccount extends Account {

    public CreditAccount(int amount) {
        if (amount > 0) {
            System.out.println("Невозможно создать кредитный счёт с положительным балансом." +
                    " Создан счёт с нулевым балансом");
        } else {
            this.amount = amount;
        }
    }

    @Override
    public boolean pay(int amount) {
        this.amount -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if (this.amount + amount > 0) {
            return false;
        } else {
            this.amount += amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Кредитный счёт (" +
                "сумма=" + amount +
                ')';
    }
}
