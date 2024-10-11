package dao;

import java.util.ArrayList;
import java.util.List;

import resources.Product;

public class MySQLProductDAO implements ProductDAO {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateProduct(Product product) {
        Product existingProduct = getProductById(product.getId());
        if (existingProduct != null) {
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
