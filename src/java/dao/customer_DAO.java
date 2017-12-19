package dao;

/**
 *
 * @author fetnat
 */


import java.util.List;
import java.util.Map;
import model.*;
public interface customer_DAO {
    
    public List<Customer> getListOfCust();
   public void insertCust(Customer cust);
   public Customer getCust(String username);
   //public String getCustPass(String id);
   public void DeleteCust(String id);
  public Customer CustValid(login login);
}

    

