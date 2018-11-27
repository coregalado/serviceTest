package catproducts.catdb.api;

import java.util.List;

import org.owasp.encoder.Encode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import catproducts.catdb.api.entities.Product;

@RestController
public class ProductController{
    @Autowired
    IProductRespository productRepo;

    @GetMapping("/allProducts")
    public List<Product> getAll(){
        List<Product> result = productRepo.findAll();
        return result;
    }

    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable String id){
        String sanitizedId = Encode.forJava(id);
        Product result = productRepo.findByRepoId(sanitizedId);
        return result;
    }
}