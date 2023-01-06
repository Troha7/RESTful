package ua.hillelit.lms.repository;

import lombok.Value;
import org.springframework.stereotype.Repository;
import ua.hillelit.lms.model.Order;
import ua.hillelit.lms.model.Orders;

/**
 * {@link OrderRepository} is a class for getting orders from the {@link Orders}.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */
@Value
@Repository
public class OrderRepository {

    Orders orders;

    /**
     * Getting the order by id.
     *
     * @param id order id
     * @return {@link Order} object
     */
    public Order getOrder(Long id) {
        return orders.getOrder(id);
    }

    /**
     * Adding the order.
     *
     * @param id    order id
     * @param order new Order
     */
    public void addOrder(Long id, Order order) {
        orders.addOrder(id, order);
    }

}
