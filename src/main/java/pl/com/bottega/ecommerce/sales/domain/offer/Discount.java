package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Objects;

public class Discount {

    private String cause;

    private Money value;

    public Discount(String cause, Money value) {
        this.cause = cause;
        this.value = value;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Discount))
            return false;
        Discount discount = (Discount) o;
        return Objects.equals(cause, discount.cause)
               && Objects.equals(value, discount.value);
    }

    @Override public int hashCode() {
        return Objects.hash(cause, value);
    }
}
