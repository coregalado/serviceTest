package catproducts.productService.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catproducts.productService.api.entities.Product;
import catproducts.productService.data.ProductDbClient;

@Service
public class ProductService {
    @Autowired
    ProductDbClient catDbClient;

    //TODO: use Business entities rather than api/presentation layer entities.
    public List<Product> getProductList(){
        //do some business validation
        //call the data layer
        //data validation
        //return data from data layer
        return null;
    }
}