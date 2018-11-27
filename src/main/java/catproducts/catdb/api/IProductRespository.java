package catproducts.catdb.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import catproducts.catdb.api.entities.Product;


@Repository
public interface IProductRespository extends MongoRepository<Product, String> {
    @Query(value="{'id':?0}")
    Product findByRepoId(String id);
}