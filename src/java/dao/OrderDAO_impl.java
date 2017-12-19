package dao;

/**
 *
 * @author fetnat
 */

 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import dao.*;
import java.util.List;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository("OrderDAO")
@Transactional
public class OrderDAO_impl implements OrderDAO{


	@Autowired
	private SessionFactory sessionFactory;
        
        @Autowired
         public Cart_DAO cartdao;

	public void addCustomerOrder(Order customerOrder) {
             sessionFactory.getCurrentSession().saveOrUpdate(customerOrder);
		/*Session session = sessionFactory.openSession();
		session.saveOrUpdate(customerOrder);
		session.flush();
		session.close();*/
	}

/*public double getCustomerOrderGrandTotal(int cartId) {
		double grandTotal=0;
		Cart cart = cartdao.getCartByCartId(cartId);
		List<CartItem> cartItems = cart.getCartItem();
		
		for(CartItem item: cartItems){
			grandTotal += item.getPrice();
		}
		return grandTotal;
	}*/





}

    /*@Autowired
    SessionFactory session;
    @Autowired
    ProductDAO product;
    
     private int getMaxOrderNum() {
        String sql = "Select max(o.orID) from " + Order.class.getName() + " o ";
        Session session1 = session.getCurrentSession();
        Query query = session1.createQuery(sql);
        Integer value = (Integer) query.uniqueResult();
        if (value == null) {
            return 0;
        }
        return value;
    }
     
     
     
     
     @Override
    public void saveOrder(Cartinf cartInfo) {
        Session session1 = session.getCurrentSession();
 
        int orderNum = this.getMaxOrderNum() + 1;
        Order order = new Order();
 
        
        order.setOrID(orderNum);
        order.setOrDate(new Date());
        
        Customer customerInfo = cartInfo.getCustomerInfo();
        order.setSname(customerInfo.getUname());
        order.setShipemail(customerInfo.getEmail());
        order.setTel(customerInfo.getPhone());
        order.setCountry(customerInfo.getAddress());
 
        session.Persist(order);
 
        List<Cartline> lines = cartInfo.getCartLines();
 
        for (Cartline line : lines) {
            OrderDetails detail = new OrderDetails();
            
            detail.setOrID(order);
            detail.setTprice(line.getProductInfo().getPprice());
            detail.setQty(line.getQuantity());
 
            String code = line.getProductInfo().getProID();
            Product product = this.product.findProduct(code);
            detail.setProID(product);
 
            session.persist(detail);
        }
        cartInfo.setOrderNum(orderNum);
    }
     
     
     
     @Override
    public Order getOrderInfo(String orderId) {
        Order order = this.findOrder(orderId);
        if (order == null) {
            return null;
        }
        return new Order(order.getOrID(), order.getOrDate(), //
                 order.getCustID(), //
                order.getShipemail(), order.getTel());
    }
  
     
     @Override
    public List<OrderDetails> listOrderDetailInfos(String orderId) {
        String sql = "Select new " + OrderDetails.class.getName() //
                + "(d.id, d.product.code, d.product.name , d.quanity,d.price,d.amount) "//
                + " from " + OrderDetails.class.getName() + " d "//
                + " where d.order.id = :orderId ";
 
        Session session = this.session.getCurrentSession();
 
        Query query = session.createQuery(sql);
        query.setParameter("orderId", orderId);
 
        return query.list();
    }
     
    
*/
