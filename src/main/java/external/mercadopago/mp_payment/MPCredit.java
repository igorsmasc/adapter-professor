package external.mercadopago.mp_payment;

import external.mercadopago.mp_order.MPOrder;

import java.util.List;

public class MPCredit implements MPPayment{
    @Override
    public boolean mpPay(List<MPOrder> mpOrders, String mpToken) {
        Double totalAmount = 0.0;
        for(MPOrder mpOrder: mpOrders) {
            totalAmount += mpOrder.getTotalAmount();
        }

        System.out.println("Método de pagamento escolhido: Cartão de Crédito");
        System.out.println("Mercado Pago esta processando o pagamento");
        System.out.println("Pagamento realizado com sucesso, valor total: " + totalAmount);

        return true;
    }
}
