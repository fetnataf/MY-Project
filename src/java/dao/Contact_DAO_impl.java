package dao;

/**
 *
 * @author fetnat
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ContactUs;
import org.springframework.transaction.annotation.Transactional;

@Repository("ContactUs_DAO")
@Transactional
public class Contact_DAO_impl implements ContactUs_DAO{
    
    @Autowired
	private SessionFactory sessionFactory;
	
    @Transactional
	public void addQuery(ContactUs queries) {
             sessionFactory.getCurrentSession().saveOrUpdate(queries);
		/*Session session = sessionFactory.openSession();
		session.save(queries);
		session.close();*/
	}

    
    
    
}
