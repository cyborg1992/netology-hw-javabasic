package ru.netology.javabasic;

import ru.netology.javabasic.taxs.TaxType;

import java.math.BigDecimal;

class Bill {
    private final BigDecimal amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = BigDecimal.valueOf(amount);
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(
                amount, //сумма облагаемая налогом
                taxAmount, //налог
                taxType.getTaxRate(), //ставка
                taxType.getTaxName()); //наименование налога
    }
}