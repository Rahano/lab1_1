package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {

    private String currency;

    private BigDecimal amount;

    public Money(String currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public Money subtract(Money otherMoney){
        return new Money(currency, this.amount.subtract(otherMoney.getAmount()));
    }

    public Money multiply(BigDecimal value){
        return new Money(currency, amount.multiply(value));
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Money))
            return false;
        Money money = (Money) o;
        return Objects.equals(currency, money.currency)
               && Objects.equals(amount, money.amount);
    }

    @Override public int hashCode() {
        return Objects.hash(currency, amount);
    }
}
