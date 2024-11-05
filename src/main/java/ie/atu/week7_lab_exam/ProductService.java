package ie.atu.week7_lab_exam;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product>myList = new ArrayList<>();

    public List<Product>addProduct(Product product){
        myList.add(product);
        return myList;
    }

    public List<Product>updateProduct(String code, Product product){
        for (Product p : myList){
            if (p.getCode() == code){
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

    public List<Product> deleteProduct(String code, Product product){
        for (Product p : myList){
            if(product.getCode() == code){
                myList.remove(p);
            }
        }
        return myList;
    }

}
