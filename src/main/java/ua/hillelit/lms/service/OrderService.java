package ua.hillelit.lms.service;

import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.hillelit.lms.model.Order;
import ua.hillelit.lms.model.Orders;
import ua.hillelit.lms.repository.OrderRepository;

import java.time.LocalDate;

/**
 * {@link OrderService} is a class for creation an order and getting orders.
 *
 * @author Dmytro Trotsenko on 06.01.2023
 */

@Value
@Service
@Scope("prototype")
public class OrderService {

    OrderRepository orderRepository;
    CartService cartService;

    /**
     * Getting the order by id.
     *
     * @param id order id
     * @return {@link Order}
     */
    public Order getOrder(Long id) {
        return orderRepository.getOrder(id);
    }

    /**
     * Getting all orders from {@link OrderRepository}.
     *
     * @return {@link Orders}
     */
    public Orders getAllOrders() {
        return orderRepository.getOrders();
    }

    /**
     * Create an order from the cart and add order to the {@link OrderRepository}.
     *
     * @param id          order id
     * @param cartService cart with products
     */
    public void addOrder(Long id, CartService cartService) {
        orderRepository.addOrder(id, new Order(id, LocalDate.now(), cartService.totalPrice(), cartService.getProducts()));
    }

}
