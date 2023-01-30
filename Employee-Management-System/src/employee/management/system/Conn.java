package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //register the driver 
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "deepak"); //creating he connection
            s = c.createStatement(); // creating statement 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
