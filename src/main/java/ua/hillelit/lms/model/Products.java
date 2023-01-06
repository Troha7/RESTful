package ua.hillelit.lms.model;

import lombok.Value;

import java.util.Map;

/**
 * {@link Products} is a class for storing a list of products.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Value
public class Products {

    Map<Long, Product> products;

    /**
     * Getting the product by id.
     *
     * @param id product id
     * @return {@link Product} object
     */
    public Product getProduct(Long id) {
        return products.get(id);
    }

}
