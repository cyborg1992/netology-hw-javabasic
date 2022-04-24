package ru.netology.javabasic.taxs;

import java.math.BigDecimal;

public class TaxType {
    protected BigDecimal taxRate = BigDecimal.valueOf(0);

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return BigDecimal.valueOf(0.0);
    }

    public String getTaxName() {
        return "";
    }

    public int getTaxRate() {
        return taxRate.multiply(BigDecimal.valueOf(100)).intValue();
    }

}