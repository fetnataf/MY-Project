/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import model.*;
/**
 *
 * @author fetnat
 */
@Repository("AdminDAO")
@Transactional
public class AdminImplDAO {
    
    @Autowired
	private SessionFactory sessionFactory;
    
    @Transactional
    public void inesertLog(Admin admin){
    
     sessionFactory.getCurrentSession().saveOrUpdate(admin);
    
    }
       public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Admin as o where o.username=? and o.password=?";
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
    

