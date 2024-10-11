import dao.MySQLProductDAO;
import dao.OracleProductDAO;
import dao.ProductDAO;
import resources.Product;
import resources.ProductDAOFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ProductDAOFactory.registerDAO("mysql", new MySQLProductDAO());
        ProductDAOFactory.registerDAO("oracle", new OracleProductDAO());

        ProductDAO mysqlDAO = ProductDAOFactory.createProductDAO("mysql");
        mysqlDAO.addProduct(new Product(1, "Producto 1", 100.0));
        mysqlDAO.addProduct(new Product(2, "Producto 2", 200.0));

        System.out.println("Productos en MySQL:");
        for (Product product : mysqlDAO.getAllProducts()) {
            System.out.println("ID: " + product.getId() + ", Descripción: " + product.getDescription() + ", Precio: " + product.getPrice());
        }

        ProductDAO oracleDAO = ProductDAOFactory.createProductDAO("oracle");
        oracleDAO.addProduct(new Product(3, "Producto 3", 300.0));
        oracleDAO.addProduct(new Product(4, "Producto 4", 400.0));

        System.out.println("\nProductos en Oracle:");
        for (Product product : oracleDAO.getAllProducts()) {
            System.out.println("ID: " + product.getId() + ", Descripción: " + product.getDescription() + ", Precio: " + product.getPrice());
        }
    }
}
