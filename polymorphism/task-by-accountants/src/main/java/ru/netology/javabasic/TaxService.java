package ru.netology.javabasic;

import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal amount, BigDecimal taxAmount, int taxRate, String taxType) {
        System.out.format("Сумма облагаемая налогом %.2f%n", amount);
        System.out.format("Система налогообложения - \"%s\". ", taxType);
        System.out.format("Ставка %d%%%n", taxRate);
        System.out.format("Уплачен налог в размере %.2f%n%n", taxAmount);
    }
}