
package dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fetnat
 */

import dao.Address_DAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import model.*;


@Repository("Address_DAO")
@Transactional
public class BillAdd_DAO_Impl implements Address_DAO{
    @Autowired
    private SessionFactory sessionfactory;
  @Transactional
    public void insertbillAddress(BillingAddress bilad) {
        sessionfactory.getCurrentSession().saveOrUpdate(bilad);
    
    }
    
    @Transactional
    public void insertshippAddress(ShippingAddress bilad) {
        sessionfactory.getCurrentSession().saveOrUpdate(bilad);
    
    }
    
    
}
