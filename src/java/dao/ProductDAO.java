package dao;

/**
 *
 * @author fetnat
 */
import java.util.List;
import model.*;

public interface ProductDAO {

    public Product findProduct(int code);

    List<Product> getAllProducts();
   void deleteProduct(int productId);
     List<Product> getProduct(int catid); 
}
