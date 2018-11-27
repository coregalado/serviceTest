package catproducts.productService.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catproducts.productService.api.entities.User;
import catproducts.productService.data.UserDbClient;

@Service
public class UserService {
    @Autowired
    UserDbClient userDbClient;

    //TODO: use Business entities rather than api/presentation layer entities.
    public List<User> getUserList(){
        //do some business validation
        //call the data layer
        //data validation
        //return data from data layer
        return null;
    }
}