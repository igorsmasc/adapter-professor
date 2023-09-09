package external.mercadopago.mp_payment;

import external.mercadopago.mp_order.MPOrder;

import java.util.List;

public interface MPPayment {
    boolean mpPay(List<MPOrder> mpOrders, String mpToken);
}
