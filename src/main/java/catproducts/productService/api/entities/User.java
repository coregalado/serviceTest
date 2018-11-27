package catproducts.productService.api.entities;

import java.util.List;

public class User {
    private String id;
    private String username;
    private double balance;
    private List<String> shoppingCart;
    private List<Integer> itemQuantities;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}