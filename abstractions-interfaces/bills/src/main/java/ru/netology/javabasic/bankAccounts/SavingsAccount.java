package ru.netology.javabasic.bankAccounts;

public class SavingsAccount extends Account {

    public SavingsAccount(int amount) {
        if (amount < 0) {
            System.out.println("Невозможно создать сберегательный счёт с отрицательным балансом. " +
                    " Создан счёт с нулевым балансом");
        } else {
            this.amount = amount;
        }
    }

    @Override
    public boolean pay(int amount) {
        return false;
    }

    @Override
    public String toString() {
        return "Сберегательный счёт (" +
                "сумма=" + amount +
                ')';
    }
}
