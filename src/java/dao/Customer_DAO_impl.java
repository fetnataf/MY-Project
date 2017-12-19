package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;
import java.util.*;
import org.springframework.*;
import java.util.ArrayList;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("customer_DAO")
@Transactional
public class Customer_DAO_impl implements customer_DAO {

    @Autowired
    private SessionFactory sessionfactory;
  
     @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;

    @Transactional
    public void insertCust(Customer cust) {
        sessionfactory.getCurrentSession().saveOrUpdate(cust);
    
    }

    @Transactional
    public Customer getCust(String username) {
        Customer cust = (Customer) sessionfactory.getCurrentSession().get(Customer.class, username);
        return cust; 
    }

    @Transactional
    public void DeleteCust(String id) {
        sessionfactory.getCurrentSession().delete(getCust(id));
    }

    @Transactional
    public List<Customer> getListOfCust() {
        List<Customer> cus = new ArrayList<Customer>();
        Criteria criteria = sessionfactory.getCurrentSession().createCriteria(Customer.class);
        cus = criteria.list();

        return cus;

    }
    
    
    @Override
    public Customer CustValid(login login) {
    String sql = "select * from users where username='" + login.getUsername()+ "' and password='" + login.getPassword()
    + "'";
    List<Customer> users = jdbcTemplate.query(sql, new UserMapper());
    return users.size() > 0 ? users.get(0) : null;
    }
  }
  class UserMapper implements RowMapper<Customer> {
  public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
    Customer user = new Customer();
    user.setUname(rs.getString("username"));
    user.setPass(rs.getString("password"));
    user.setFname(rs.getString("firstname"));
    user.setLname(rs.getString("lastname"));
    user.setEmail(rs.getString("email"));
    user.setAddress(rs.getString("address"));
    user.setPhone(rs.getString("phone"));
    return user;
  }
    
    
    
    
    
    }


