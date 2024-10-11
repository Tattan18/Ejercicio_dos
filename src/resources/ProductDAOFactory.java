package resources;

import java.util.Map;
import java.util.HashMap;

import dao.ProductDAO;

public class ProductDAOFactory {
    private static Map<String, ProductDAO> registeredDAOs = new HashMap<>();

    public static void registerDAO(String dbType, ProductDAO dao) {
        registeredDAOs.put(dbType.toLowerCase(), dao);
    }

    public static ProductDAO createProductDAO(String dbType) {
        ProductDAO dao = registeredDAOs.get(dbType.toLowerCase());
        if (dao == null) {
            throw new IllegalArgumentException("Tipo de base de datos no soportado.");
        }
        return dao;
    }
}
