package resources;

public class Product {
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }

    public void setId(int id) { this.id = id; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(double price) { this.price = price; }
}
