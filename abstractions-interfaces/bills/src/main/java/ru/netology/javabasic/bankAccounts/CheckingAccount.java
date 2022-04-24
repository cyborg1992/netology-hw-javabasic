package ru.netology.javabasic.bankAccounts;

public class CheckingAccount extends Account {
    public CheckingAccount(int amount) {
        if (amount < 0) {
            System.out.println("Невозможно создать расчётный счёт с отрицательным балансом. " +
                    " Создан счёт с нулевым балансом");
        } else {
            this.amount = amount;
        }
    }

    @Override
    public boolean pay(int amount) {
        if (this.amount < amount) {
            return false;
        } else {
            this.amount -= amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Расчётный счёт (" +
                "сумма=" + amount +
                ')';
    }
}
