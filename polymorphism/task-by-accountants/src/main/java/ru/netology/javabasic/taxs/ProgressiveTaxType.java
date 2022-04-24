package ru.netology.javabasic.taxs;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType { //прогрессивный налог

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal amountLimit = BigDecimal.valueOf(100000);
        if (amount.compareTo(amountLimit) < 0) {
            taxRate = BigDecimal.valueOf(0.10);
        } else {
            taxRate = BigDecimal.valueOf(0.15);
        }
        return amount.multiply(taxRate);
    }

    @Override
    public String getTaxName() {
        return "Прогрессивный налог";
    }

}
