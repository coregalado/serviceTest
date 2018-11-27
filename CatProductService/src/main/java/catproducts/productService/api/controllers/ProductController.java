package catproducts.productService.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import catproducts.productService.api.entities.Product;
import catproducts.productService.business.ProductService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class ProductController{
    @Autowired
    ProductService manager;

    // @Value("${PRODUCT_SERVICE_URL}")
    // private String myTestVariable;

    @GetMapping("/Products")
    @ResponseBody
    List<Product> getProducts (String v){
        // System.out.println("printing " + myTestVariable);
        List<Product> result = callDB();
        //String id, String name, double price, String description, int quantity, String productImage
        //Product catToy = new Product("1", "Cute Cat Toy", 10.99, "It is a cute cat toy.", 10, "picture1");
        //List<Product> result = Arrays.asList(catToy);
        return result;
    }
     private List<Product> callDB () {
         String uri = "http://localhost:8081/allProducts"; //place myTestVariable here, when database is hooked up on heroku
         RestTemplate restTemplate = new RestTemplate();
         ResponseEntity<List<Product>> result = restTemplate.exchange(uri,
         HttpMethod.GET,null, 
         new ParameterizedTypeReference<List<Product>>(){});
         return result.getBody();
    }
}