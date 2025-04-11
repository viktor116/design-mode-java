package strategies;

/**
 * @author soybean
 * @date 2025/3/12 17:45
 * @description
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
