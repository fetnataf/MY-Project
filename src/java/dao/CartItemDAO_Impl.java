package dao;

import java.util.List;
import model.Cart;
import model.CartItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fetnat
 */
@Component
@Repository("CartItem_DAO")
@Transactional
public class CartItemDAO_Impl implements CartItem_DAO{
    
    
    @Autowired
	private SessionFactory sessionFactory;


    @Override
	public void addCartItem(CartItem cartItem) {
            
                sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
                
	//Session session = sessionFactory.openSession();
		//session.saveOrUpdate(cartItem);
		//session.flush();
		//session.close();
	}

	public void removeCartItem(int CartItemId) {
		Session session = sessionFactory.openSession();
		CartItem cartItem = (CartItem) session.get(CartItem.class, CartItemId);
		session.delete(cartItem);
		Cart cart = cartItem.getCart();
		List<CartItem> cartItems = cart.getCartItem();
		cartItems.remove(cartItem);
		session.flush();
		session.close();
	}

	public void removeAllCartItems(Cart cart) {
		List<CartItem> cartItems = cart.getCartItem();
		for (CartItem cartItem : cartItems) {
			removeCartItem(cartItem.getCartItemId());
		}
	}

}
