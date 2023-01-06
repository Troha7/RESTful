package ua.hillelit.lms.repository;

import lombok.Value;
import org.springframework.stereotype.Repository;
import ua.hillelit.lms.model.Product;
import ua.hillelit.lms.model.Products;

/**
 * {@link ProductRepository} is a class for getting products from the {@link Products}.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Value
@Repository
public class ProductRepository {

    Products products;

    /**
     * Getting the product by id.
     *
     * @param id product id
     * @return {@link Product} object
     */
    public Product getProduct(Long id) {
        return products.getProduct(id);
    }

}
