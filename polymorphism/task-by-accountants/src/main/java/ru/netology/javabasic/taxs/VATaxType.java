package ru.netology.javabasic.taxs;

import java.math.BigDecimal;

public class VATaxType extends TaxType { //НДС 18%
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        taxRate = BigDecimal.valueOf(0.18); //ставка 18%
        return amount.multiply(taxRate);
    }

    @Override
    public String getTaxName() {
        return "НДС";
    }
}
