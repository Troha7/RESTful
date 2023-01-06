package ua.hillelit.lms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

/**
 * {@link Order} is an order data class.
 *
 * @author Dmytro Trotsenko on 05.01.2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private LocalDate date;
    private Double cost;
    private Map<Long, Product> products;

}
