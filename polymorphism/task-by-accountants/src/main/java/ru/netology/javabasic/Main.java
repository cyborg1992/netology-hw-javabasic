package ru.netology.javabasic;

import ru.netology.javabasic.taxs.IncomeTaxType;
import ru.netology.javabasic.taxs.ProgressiveTaxType;
import ru.netology.javabasic.taxs.VATaxType;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(99999, new IncomeTaxType(), taxService),
                new Bill(99999, new VATaxType(), taxService),
                new Bill(100000, new ProgressiveTaxType(), taxService),
                new Bill(99999, new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            System.out.println("Счёт №" + (i + 1));
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
