package controllers;

import dao.*;
import java.util.ArrayList;

import java.util.List;
import model.Cart;
import model.CartItem;
import model.Customer;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fetnat
 */

@Controller
public class CartController {
    @Autowired
    public Cart_DAO cart;
    
    @Autowired
    public CartItem_DAO cartitem;
    
    @Autowired
    private customer_DAO customer;
    
    @Autowired
    public ProductDAO pro;

    public Cart_DAO getCart() {
        return cart;
    }

    public void setCart(Cart_DAO cart) {
        this.cart = cart;
    }

    public CartItem_DAO getCartitem() {
        return cartitem;
    }

    public void setCartitem(CartItem_DAO cartitem) {
        this.cartitem = cartitem;
    }

    public customer_DAO getCustomer() {
        return customer;
    }

    public void setCustomer(customer_DAO customer) {
        this.customer = customer;
    }

   
    
   
    
     @RequestMapping(value = "/Cart/{username}")
    public ModelAndView cartPage(@PathVariable(value="username") String uname) {
        List<Cart> carts =cart.cartByuser(customer.getCust(uname));
        return new ModelAndView("Cart", "cart", carts);
    }
 
    
    @RequestMapping(value="cart/add/{username}" ,method = RequestMethod.POST) //{proID}/{username}/{quantity}/{pprice} ServletRequest req
    //@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public String addCartItem( 
             @RequestParam(value = "productCode") int productCode,
             @PathVariable(value="username") String uname,           
             @RequestParam(value="pprice")double pprice,
             @RequestParam(value="quantity")int qty
			){
		//Customer cust = customer.getCust(req.getParameter("username"));
                //System.out.println("Customer : " + cust.getFname());
               // Cart cart=cust.getCart();  
                //Product prod=pro.findProduct(Integer.parseInt( req.getParameter("productCode")));
                //System.out.println("product: "+prod.getProID());
               // int qty = Integer.parseInt( req.getParameter("quantity"));
               // System.out.println("qty: "+qty);
                //double pprice = Double.parseDouble(req.getParameter("pprice"));
              Customer cust = customer.getCust(uname);
             
              System.out.println(cust.getEmail());
              Product prod=pro.findProduct(productCode);
                Cart newCart=new Cart();
              //newCart=cart.validate(newCart.getCartId());
                 System.out.println(cust.getCart());
                newCart.setCustomer(cust);
                System.out.println(newCart);
                List<CartItem> cartitems1;
        cartitems1 = new ArrayList<CartItem>();
              
               System.out.println("list done" + newCart.getCartItem());
        for (CartItem cartItem : cartitems1) {
            if(prod.getProID()==(cartItem.getProduct().getProID())){
                cartItem.setQuantity(qty+1);
                cartItem.setPrice(cartItem.getQuantity()*cartItem.getProduct().getPprice());
                cartItem.setCart(newCart);
                cartitem.addCartItem(cartItem);
                System.out.println("cartitem added");
                
                
            }
        }
               CartItem cartItem = new CartItem();
		cartItem.setQuantity(1);
		cartItem.setProduct(prod);
		cartItem.setPrice(prod.getPprice()* 1);  
		cartItem.setCart(newCart);
               //cart.addCart(newCart);
		cartitem.addCartItem(cartItem);
                return "redirect:/listpro";
         }
        
        
        @RequestMapping(value="removeItem/{cartItemId}/{username}")
        public String deletItem(@PathVariable(value="cartItemId") int itemID,
                @PathVariable(value="username") String username){
        cartitem.removeCartItem(itemID);
        return "redirect:/Cart/{username}";
        }
        
        
      
        
        

}
              
        
        /*@RequestMapping("cart/getCartById/{username}")
	public String getCartId(@PathVariable(value="username") String uname,Model model){
        
		          System.out.println("reading");
		Customer customr = customer.getCust(uname);
		model.addAttribute("cartId", customr.getCart().getCartId());
		return "Cart";
	}*/


