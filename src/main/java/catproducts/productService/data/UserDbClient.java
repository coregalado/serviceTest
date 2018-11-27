package catproducts.productService.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import catproducts.productService.api.entities.User;

@Repository
public class UserDbClient {
    //TODO: use DB entities rather than api layer entities.
    public List<User> getUserData() {
        //db validation
        //set up client
        //call the database
        //mapping
        //return to bus layer
        return null;
    }
}