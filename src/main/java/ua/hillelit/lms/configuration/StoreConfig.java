package ua.hillelit.lms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.hillelit.lms.model.Product;
import ua.hillelit.lms.model.Products;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link StoreConfig} is a class for creation and configuration {@link Products}.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Configuration
public class StoreConfig {

    /**
     * Create new product list and add {@link Product}
     *
     * @return new {@link Products}
     */
    @Bean
    public Products products() {
        Map<Long, Product> products = new HashMap<>();
        products.put(0L, new Product(0L, "Milk", 40.0));
        products.put(1L, new Product(1L, "Bread", 18.50));
        products.put(2L, new Product(2L, "Coca-Cola", 50.0));
        products.put(3L, new Product(3L, "Sugar", 35.0));
        return new Products(products);
    }

}
