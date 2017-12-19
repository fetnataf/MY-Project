
package controllers;

import dao.AdminDAO;
import dao.ProductDAO;
import dao.customer_DAO;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import model.*;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fetnat
 */
@Controller
public class adminCont {
     @Autowired
    public customer_DAO custDAO;
    
    @Autowired
    public ProductDAO Prodao;
  
   
    
     @RequestMapping(value = "/adminlogIn")
    public String showForm(Map map) {
         Admin admin = new Admin();
		map.put("Admin", admin);
        return "adminlogIn";
    }
    
    @RequestMapping(value = "/adminmng")
    public String adminmng() {
        return "adminmng";
        
        
    }
    
    
    @RequestMapping(value = "/Users")
    public ModelAndView getUsers() {
        List<Customer> users = custDAO.getListOfCust();
        return new ModelAndView("Users", "customer", users);
    }
    
    
    @RequestMapping(value = "/Adminlog", method = RequestMethod.POST)
  public String processForm(@Valid Admin admin,BindingResult result,HttpSession session,
			Map model) {

   
			return "adminlogIn";
		}

	@RequestMapping(value="/delete/user/{uname}")
        public String deleteUser(@PathVariable(value="uname")String username ){
        custDAO.DeleteCust(username);
        return"redirect:/Users";
        }
        
        @RequestMapping(value = "/adminpro")
    public ModelAndView getAllProducts() {
        List<Product> products = Prodao.getAllProducts();
        return new ModelAndView("adminpro", "product", products);
    }
        
        @RequestMapping(value="/delete/product/{proID}")
        public String deleteUser(@PathVariable(value="proID")int code ){
       Prodao.deleteProduct(code);
        return "redirect:/adminpro";
        }
        
        
        

}