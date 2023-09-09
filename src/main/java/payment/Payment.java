package payment;

import order.Order;

public interface Payment {
    boolean pay(Order order);
}
