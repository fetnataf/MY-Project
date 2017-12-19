package dao;

/**
 *
 * @author fetnat
 */

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.*;
import org.hibernate.Query;
import org.springframework.stereotype.Component;
@Component
@Repository("Cart_DAO")
@Transactional
public class CartDAO_Impl implements Cart_DAO {
    
        @Autowired
        public OrderDAO order;

	@Autowired
	private SessionFactory sessionFactory;
        @Autowired
        public customer_DAO customer;

	
@Transactional
@Override
	public Cart getCartByCartId(int CartId) {
		Session session = sessionFactory.openSession();
		Cart cart = (Cart) session.get(Cart.class, CartId);
		// System.out.println(cart.getCartId() + " " + cart.getCartItem());
		System.out.println(cart);
		session.close();
		return cart;

	}
@Transactional
@Override
	public Cart validate(int cartId) throws IOException {
		Cart cart = getCartByCartId(cartId);
		if (cart == null || cart.getCartItem().isEmpty()) {
			throw new IOException(cartId + "");
		}
		//update(cart);
		return cart;
	}
/*@Transactional
@Override
	public void update(Cart cart) {

		int cartId = cart.getCartId();
		double grandTotal = order.getCustomerOrderGrandTotal(cartId);
		cart.setTotalPrice(grandTotal);

		Session session = sessionFactory.openSession();
		session.saveOrUpdate(cart);
		session.flush();
		session.close();
	}*/
        
//        @Transactional
//	public void add(Cart cart) {
//
//		int cartId = cart.getCartId();
//		double grandTotal =order.getCustomerOrderGrandTotal(cartId);
//		cart.setTotalPrice(grandTotal);
//
//		Session session = sessionFactory.openSession();
//		session.saveOrUpdate(cart);
//		session.flush();
//		session.close();
//	}
        @Transactional
        @Override
	public void addCart(Cart cart) {
            
                sessionFactory.getCurrentSession().saveOrUpdate(cart);

}

@Override
public List <Cart> cartByuser(Customer cust){
 Session session = sessionFactory.openSession();
// String SQL_QUERY ="from Cart where U_NAME ="+cust.getUname();
  Query query = session.createQuery("from Cart where U_NAME ='"+cust.getUname()+"'");
   List list = query.list();
    session.flush();
		session.close();
		return list;
}



}