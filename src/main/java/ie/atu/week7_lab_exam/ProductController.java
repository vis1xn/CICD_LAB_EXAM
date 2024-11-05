package ie.atu.week7_lab_exam;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController (ProductService myService){
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();

    @PostMapping("/create")
    public List<Product> newProduct(@RequestBody Product product){
        list = myService.addProduct(product);
        return list;
    }

    @PutMapping("/update/{code}")
    public List<Product> updateProduct(@PathVariable String code, @RequestBody Product product){
        list = myService.updateProduct(code, product);
        return list;
    }

    @DeleteMapping("/delete/{code}")
    public List<Product> deleteProduct(@PathVariable String code, @RequestBody Product product){
        list = myService.deleteProduct(code, product);
        return list;
    }
}
