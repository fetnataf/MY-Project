package dao;

/**
 *
 * @author fetnat
 */
import model.*;
public interface LogInForm_DAO {
    public boolean checkLogin(String userName, String userPassword);
     public void insertLog(login log);
}
