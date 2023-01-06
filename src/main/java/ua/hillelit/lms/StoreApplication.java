package ua.hillelit.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ua.hillelit.lms.service.CartService;
import ua.hillelit.lms.service.OrderService;

@SpringBootApplication
public class StoreApplication {

    @Autowired
    private CartService cartService1;

    @Autowired
    private CartService cartService2;

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void inited() {

        cartService1.addProduct(0L);
        cartService1.addProduct(3L);
        System.out.println("Added products to cart1: " + cartService1.getProducts());

        cartService2.addProduct(1L);
        cartService2.addProduct(2L);
        System.out.println("Added products to cart2: " + cartService2.getProducts());

        orderService.addOrder(0L, cartService1);
        orderService.addOrder(1L, cartService2);
        System.out.println("All orders: " + orderService.getAllOrders());
    }

}
