// 특정한 값이나 속성을 표현하는 역할
// 특징 : 불변성, 동등성 비교
public class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // equals(), hashCode(), getter methods
}
