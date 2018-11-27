package catproducts.productService.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import catproducts.productService.api.entities.Product;

@Repository
public class ProductDbClient {
    //TODO: use DB entities rather than api layer entities.
    public List<Product> getProductData() {
        //db validation
        //set up client
        //call the database
        //mapping
        //return to bus layer
        return null;
    }
}