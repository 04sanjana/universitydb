package javaapplication1;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    // Constructor to establish the connection
    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection with correct database name
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsytem", "root", "admin");

            // Create statement object to execute queries
            s = c.createStatement();
        } catch (Exception e) {
            // Print exception stack trace if any error occurs
            e.printStackTrace();
        }
    }
}
