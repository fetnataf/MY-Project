
package dao;

import model.Admin;

/**
 *
 * @author fetnat
 */
public interface  AdminDAO {
     public void insertLog(Admin admin);
     public boolean checkLogin(String userName, String userPassword);
    
}
