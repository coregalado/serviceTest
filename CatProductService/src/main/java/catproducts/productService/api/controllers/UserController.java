package catproducts.productService.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import catproducts.productService.api.entities.User;
import catproducts.productService.business.UserService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class UserController{
    @Autowired
    UserService manager;

    @GetMapping("/Users")
    @ResponseBody
    List<User> getUsers (String v){
        List<User> result = callDB();
        return result;
    }
     private List<User> callDB () {
         String uri = "http://localhost:8081/allUsers";
         RestTemplate restTemplate = new RestTemplate();
         ResponseEntity<List<User>> result = restTemplate.exchange(uri,
         HttpMethod.GET,null, 
         new ParameterizedTypeReference<List<User>>(){});
         return result.getBody();
    }
}