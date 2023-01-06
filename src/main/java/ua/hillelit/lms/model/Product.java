package ua.hillelit.lms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link Product} is a product data class.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Double cost;

}
