package payment.mercadopago_adapter;

import order.Order;
import payment.Payment;
import external.mercadopago.mp_order.MPOrder;
import external.mercadopago.mp_payment.MPCredit;
import external.mercadopago.mp_payment.MPPayment;

import java.util.List;
import java.util.UUID;

public class PaymentMPCreditCard implements Payment {
    @Override
    public boolean pay(Order order) {
        MPPayment mpPayment = new MPCredit();

        String token = getToken();

        return mpPayment.mpPay(
                List.of(orderToMPOrder(order)),
                token
        );
    }

    private MPOrder orderToMPOrder(Order order) {
        return new MPOrder(order.getId(), order.getTotalAmount());
    }

    private String getToken() {
        return UUID.randomUUID().toString();
    }
}
