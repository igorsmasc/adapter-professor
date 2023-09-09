package payment.startupPayment;

import order.Order;
import payment.Payment;

public class Pix implements Payment {
    @Override
    public boolean pay(Order order) {
        System.out.println("Pagando via pix");
        System.out.println("Processando pix...");
        System.out.println("Valor pago: " + order.getTotalAmount());
        return true;
    }
}
