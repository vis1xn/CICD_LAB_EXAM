package ie.atu.week7_lab_exam;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Pattern(regexp = "PROD-XXXX", message = "Code cannot be blank")
    private String code;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    @PositiveOrZero(message = "Quantity must be greater than or equal to zero")
    private int quantity;

    @PositiveOrZero(message = "Price cannot be below zero")
    private double price;

}