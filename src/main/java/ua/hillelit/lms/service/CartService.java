package ua.hillelit.lms.service;

import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.hillelit.lms.model.Product;
import ua.hillelit.lms.repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link CartService} is a class for storing a list of products for this cart,
 * and for adding and removing products from the cart.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Value
@Service
@Scope("prototype")
public class CartService {

    ProductRepository productRepository;
    Map<Long, Product> products = new HashMap<>();

    /**
     * Adding product to the cart.
     *
     * @param id id product id
     */
    public void addProduct(Long id) {
        products.put(id, productRepository.getProduct(id));
    }

    /**
     * Removing the product from the cart.
     *
     * @param id product id
     */
    public void removeProduct(Long id) {
        products.remove(id, productRepository.getProduct(id));
    }

    /**
     * Calculation of the total cost of products.
     *
     * @return total price of products
     */
    public Double totalPrice() {
        return products.values().stream()
                .map(Product::getCost)
                .reduce(0.0, Double::sum);
    }

}
