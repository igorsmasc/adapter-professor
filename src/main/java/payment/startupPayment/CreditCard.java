package payment.startupPayment;

import order.Order;
import payment.Payment;

public class CreditCard implements Payment {

    @Override
    public boolean pay(Order order) {

        System.out.println("Pagando com cartão de crédito");
        System.out.println("Processando pagamento...");
        System.out.println("Valor pago: " + order.getTotalAmount());
        return true;
    }
}
