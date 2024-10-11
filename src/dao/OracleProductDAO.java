package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import resources.Product;

public class OracleProductDAO implements ProductDAO {
    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        if (products.containsKey(product.getId())) {
            products.put(product.getId(), product);
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return products.values().stream().collect(Collectors.toList());
    }
}
