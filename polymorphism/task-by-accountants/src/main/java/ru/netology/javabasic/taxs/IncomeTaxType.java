package ru.netology.javabasic.taxs;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType { //подоходный налог

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        taxRate = BigDecimal.valueOf(0.13);
        return amount.multiply(taxRate);
    }

    @Override
    public String getTaxName() {
        return "Подоходный налог";
    }
}
