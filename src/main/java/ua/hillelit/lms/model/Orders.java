package ua.hillelit.lms.model;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Orders} is a class for storing a list of orders.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Value
@Component
public class Orders {

    Map<Long, Order> orders = new HashMap<>();

    /**
     * Getting the order by id.
     *
     * @param id order id
     * @return {@link Order} object
     */
    public Order getOrder(Long id) {
        return orders.get(id);
    }

    /**
     * Adding the order.
     *
     * @param id    order id
     * @param order new Order
     */
    public void addOrder(Long id, Order order) {
        orders.put(id, order);
    }

}
