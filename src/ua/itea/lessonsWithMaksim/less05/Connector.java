package ua.itea.lessonsWithMaksim.less05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by vitaliy on 12/5/16.
 */
public class Connector {

    private Connection con ;
    private Statement st ;

    public Connector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/social?user=root&password=12345");
        st = con.createStatement();
    }

}
