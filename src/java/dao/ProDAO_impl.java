package dao;

/**
 *
 * @author fetnat
 */

import java.sql.Blob;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.*;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

@Repository("ProductDAO")
@Transactional
public class ProDAO_impl implements ProductDAO{
    
    @Autowired
    private SessionFactory sessionfactory;
    @Transactional
    @Override
    public List<Product> getAllProducts() {
    Session session = sessionfactory.openSession();
		List<Product> products = session.createCriteria(Product.class).list();
		System.out.println("----- List of Products-----");
		System.out.println(products);
		session.flush();
		session.close();
		return products;
    }
    
    @Transactional
    @Override
    public Product findProduct(int code) {
       // Reading the records from the table
		Session session = sessionfactory.openSession();
		Product product = (Product) session.get(Product.class, code);
		session.close();
		return product;
	}
   @Transactional
    @Override
    public List<Product> getProduct(int catID){
        Session session = sessionfactory.openSession();
      Query query = session.createQuery("from Product where catid ="+catID);
    List list = query.list();
    session.flush();
		session.close();
		return list;
    
    }
    @Transactional
    @Override
    public void deleteProduct(int productId) {
		Session session = sessionfactory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		session.delete(product);
		session.flush();
		session.close();// close the session
	}
    
}
