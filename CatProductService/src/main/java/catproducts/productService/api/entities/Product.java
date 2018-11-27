package catproducts.productService.api.entities;

public class Product {
    private String id;
    private String name;
    private double price;
    private String description;
    private int quantity;
    private String productImage;

    public Product(){
        super();
    }
    public Product (String id, String name, double price, String description, int quantity, String productImage) {
        super();
        this.id = id;
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
        this.setQuantity(quantity);
        this.setProductImage(productImage);
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getId () {
        return this.id;
    }
    
}