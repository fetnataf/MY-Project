
package controllers;

import dao.CartItem_DAO;
import dao.OrderDAO;
import dao.customer_DAO;
import java.util.Date;
import model.Cart;
import model.Customer;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class OrderCont {
    
     @Autowired
     OrderDAO orderdao;
     
      
    @Autowired
    private customer_DAO customer;
    
    @Autowired
    public CartItem_DAO cartitem;
    
     @RequestMapping(value="OrderConf")
     public String AddOrder(){
         return "OrderConf";
     }
     
     @RequestMapping(value="thankYou/{username}")
     public String SetOrder(@PathVariable(value="username")String uname){
         //Customer cust= customer.getCust(uname);
         //Cart cart1=cust.getCart();
         //cartitem.removeAllCartItems(cart1);
         return "thankYou";
     }
     
     
     @RequestMapping(value="order/add" , method = RequestMethod.POST)
     public String addOrder(
     
            @RequestParam(value="username") String uname,           
            @RequestParam(value="totalprice")double tprice,
            @RequestParam(value="quantity")int qty){
         
     Order order=new Order();
     Customer cust= customer.getCust(uname);
     order.setCustomer(cust);
     order.setPrice(tprice);
     order.setQty(qty);
     order.setOrDate(new Date());
     orderdao.addCustomerOrder(order);
     return "OrderConf";
     }
    
}
