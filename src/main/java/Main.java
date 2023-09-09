import order.Item;
import order.Order;
import payment.Payment;
import payment.mercadopago_adapter.PaymentMPCreditCard;
import payment.mercadopago_adapter.PaymentMPPix;
import payment.startupPayment.CreditCard;
import payment.startupPayment.Pix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Item item = new Item("sapato", 100.0, 1);
        Item item2 = new Item("blusa", 50.0, 2);

        Order order1 = new Order(1L, Arrays.asList(item, item2));

        Payment payment = new PaymentMPPix();

        payment.pay(order1);

    }
}
