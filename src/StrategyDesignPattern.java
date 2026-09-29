public class StrategyDesignPattern {
    public interface PaymentProcessor{
        public void processor();
    }
    static class CreditCard implements PaymentProcessor{
        public void processor(){
            System.out.println("Payment is done by creditcard");
        }
    }
    static class Paypal implements PaymentProcessor{
        public void processor(){
            System.out.println("Payment is done by paypal");
        }
    }
    static class Stripe implements PaymentProcessor{
        public void processor(){
            System.out.println("Payment is done by stripe");
        }
    }
    static class PaymentStrategy{
        private PaymentProcessor paymentProcessor;
        public PaymentStrategy(PaymentProcessor paymentProcessor){
            this.paymentProcessor=paymentProcessor;
        }
        public void processor(){
            paymentProcessor.processor();
        }
        public void setProcessor(PaymentProcessor paymentProcessor){
            this.paymentProcessor=paymentProcessor;
        }
    }
    public static void main(String[] args) {
        PaymentProcessor credit=new CreditCard();
        PaymentProcessor paypal=new Paypal();
        PaymentProcessor stripe=new Stripe();
        PaymentStrategy payment=new PaymentStrategy(credit);
        payment.processor();
        payment.setProcessor(paypal);
        payment.processor();
        }
    }

