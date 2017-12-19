package dao;

/**
 *
 * @author fetnat
 */

import org.springframework.stereotype.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import java.util.List;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Repository("LogInForm_DAO")
@Transactional
public class logInDAO_Impl implements LogInForm_DAO{
    
@Autowired
	private SessionFactory sessionFactory;
       

@Transactional
    public void insertLog(login log) {
        sessionFactory.getCurrentSession().saveOrUpdate(log);
    
    }


       public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from login as o where o.username=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);
			query.setParameter(1,userPassword);
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
       }
}
