package dao;

import java.util.List;

import resources.Product;

public interface ProductDAO {
    void addProduct(Product product);
    Product getProductById(int id);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
}
