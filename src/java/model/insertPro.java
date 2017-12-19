package model;

/**
 *
 * @author fetnat
 */
import java.sql.*;
import java.io.*;

public class insertPro {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "fetnat", "111");

            PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
            ps.setString(1, "13");
            ps.setString(3, "excavator");
            ps.setString(4, "9");
            ps.setString(5, "11");
            ps.setString(6, "");
            ps.setString(7, "5");

            FileInputStream fin = new FileInputStream("C:\\Users\\fetto\\Documents\\NetBeansProjects\\PreOwned.com\\web\\WEB-INF\\images\\13.jpg");
            ps.setBinaryStream(2, fin, fin.available());
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
