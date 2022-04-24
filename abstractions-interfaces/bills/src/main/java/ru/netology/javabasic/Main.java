package ru.netology.javabasic;

import ru.netology.javabasic.bankAccounts.Account;
import ru.netology.javabasic.bankAccounts.CheckingAccount;
import ru.netology.javabasic.bankAccounts.CreditAccount;
import ru.netology.javabasic.bankAccounts.SavingsAccount;

public class Main {
    static Account savingsAccount;
    static Account creditAccount;
    static Account checkingAccount;

    public static void main(String[] args) {
        savingsAccount = new SavingsAccount(200_000);
        creditAccount = new CreditAccount(-300_000);
        checkingAccount = new CheckingAccount(200_000);
        printAccounts();
        if (!savingsAccount.pay(11_111)) {
            System.out.println("Невозможно осуществить платёж со сберегательного счёта");
        }
        if (!checkingAccount.pay(600_000)) {
            System.out.println("На расчётном счёте недостаточно средств для платежа");
        }
        if (!creditAccount.addMoney(600_000)) {
            System.out.println("Не удалось пополнить баланс кредитного счёта. Сумма пополнения больше кредита");
        }
        if (savingsAccount.transfer(creditAccount, 33_222)) {
            System.out.println("Осуществлен перевод со сберегательного на кредитный счёт");
        }
        if (checkingAccount.pay(11_111)) {
            System.out.println("Осуществлен платёж с расчётного счёта");
        }

        System.out.println();
        printAccounts();
    }

    public static void printAccounts() {
        System.out.println("$$$  Печать текущего баланса счетов:  $$$");
        System.out.println(savingsAccount + "\n" +
                creditAccount + "\n" +
                checkingAccount + "\n"
        );
    }
}
