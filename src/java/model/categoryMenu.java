package model;

/**
 *
 * @author fetnat
 */
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
public class categoryMenu extends HttpServlet{
    
    List list=new ArrayList<String>();
    String info;
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
    try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:XE","fetnat","111");  
PreparedStatement ps=con.prepareStatement("select * from product where catid=1"); 
ResultSet rs=ps.getResultSet();
while(rs.next()){
    info=rs.getString(1);
    list.add(info);
}


}
    catch(ClassNotFoundException e){}
catch(SQLException e){}

}}
