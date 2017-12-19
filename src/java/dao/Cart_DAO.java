package dao;

/**
 *
 * @author fetnat
 */
import java.io.IOException;
import java.util.List;

import model.Cart;
import model.Customer;

public interface Cart_DAO {

	Cart getCartByCartId(int CartId);
	void addCart(Cart cart);
	Cart validate(int cartId) throws IOException;
	List<Cart> cartByuser(Customer cust);
	//void update(Cart cart);
}