package controllers;

/**
 *
 * @author fetnat
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;
import java.util.Map;
import javax.validation.*;
import model.*;
import org.springframework.context.annotation.*;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.*;
import dao.*;
import javax.servlet.ServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Controller

public class CustFormCont {
    
    @Autowired
    public customer_DAO custDAO;
    
    @Autowired
    public ProductDAO Prodao;
    
    @Autowired
    public LogInForm_DAO log;
    
    @Autowired
    public Address_DAO bilAdd;
    
    public static final String FORM_WITH_VALIDATION = "Reg";
    
    @RequestMapping(value = "/Reg")
    public String showForm(Model map) {
        map.addAttribute("customer", new Customer());
      //map.put("costumer", Customer);
        return "Reg";
    }
    
    @RequestMapping(value = "/RegistrationForm")
    public String RegForm(Model map) {
        map.addAttribute("customer", new Customer());
      //map.put("costumer", Customer);
        return "RegistrationForm";
    }
    
    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public String addCust(@ModelAttribute("customer") Customer cust,
            @RequestParam(value = "uname", required = true) String username,
            @RequestParam(value = "pass", required = true) String password,
            BindingResult result,
            Map<String, Object> map) {        
        Customer Ncust = new Customer();
        custDAO.insertCust(cust);
        Ncust = cust;
        map.put("customer", Ncust);
        login login = new login();
        login.setUsername(username);
        login.setCustID(cust);
        login.setPassword(password);
        log.insertLog(login);
        
        return "success";
        
    }
    
     @RequestMapping(value = "/contactinfo/{username}")
    public ModelAndView getCustomer(@PathVariable("username") String uname) {
        Customer cust=custDAO.getCust(uname);
        return new ModelAndView("contactinfo", "customer", cust);
    }
    
    
     @RequestMapping(value = "/BillingAddForm")
    public String billForm(Model map) {
        map.addAttribute("billingaddress", new BillingAddress());
 
        return "BillingAddForm";
    }
    
    
    @RequestMapping(value = "/BillingProcess/{username}", method = RequestMethod.POST)
    public String addBill(
@ModelAttribute("billingaddress") BillingAddress biladd,
            @PathVariable(value="username") String uname,
            @RequestParam(value="city") String city,
           @RequestParam(value="province") String province,
            @RequestParam(value="postalcode") String postal,
           @RequestParam(value="address") String address,
             BindingResult result,
            Map<String, Object> map){
    
        BillingAddress newaddress=new BillingAddress();
        newaddress.setCustomer(custDAO.getCust(uname));
        newaddress.setCity(city);
        newaddress.setPostalcode(postal);
        newaddress.setProvince(province);
        newaddress.setAddress(address);
      
       System.out.println("cutomer "+newaddress.getCustomer());
    bilAdd.insertbillAddress(newaddress);
    
   map.put("billingaddress", newaddress);
    return "redirect:/contactinfo";
    }
    
    @RequestMapping(value = "/ShipAddress")
    public String shipForm(Model map) {
        map.addAttribute("shippingaddress", new ShippingAddress());
 
        return "ShipAddress";
    }
    
    
    @RequestMapping(value = "/ShippingProcess/{username}", method = RequestMethod.POST)
    public String addBill(@ModelAttribute("shippingaddress") ShippingAddress biladd,
            @PathVariable(value="username") String uname,
            @RequestParam(value="city") String city,
           @RequestParam(value="province") String province,
            @RequestParam(value="postalCode") String postal,
           @RequestParam(value="address") String address,
             BindingResult result,
            Map<String, Object> map){
    ShippingAddress newaddress=new ShippingAddress();
        newaddress.setCustomer(custDAO.getCust(uname));
        newaddress.setCity(city);
        newaddress.setpostalCode(postal);
        newaddress.setPovince(province);
        newaddress.setAddress(address);
      
       System.out.println("cutomer "+newaddress.getCustomer());
    bilAdd.insertshippAddress(newaddress);
    
   map.put("shippingaddress", newaddress);
    return "contactinfo";
    }
    
    
    
}
