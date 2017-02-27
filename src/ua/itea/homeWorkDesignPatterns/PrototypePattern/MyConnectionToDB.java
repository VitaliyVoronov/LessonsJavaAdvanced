package ua.itea.homeWorkDesignPatterns.PrototypePattern;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/27/17
 */
public class MyConnectionToDB {

    Connection con ;
    Statement st ;

    public MyConnectionToDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/prototype?user=root&password=12345");
        st = con.createStatement();

    }

    public List<User> getUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        User user = new User();
        ResultSet rs = st.executeQuery("SELECT * FROM user");
        while (rs.next()){
            user.setName(rs.getString(2));
            user.setSurname(rs.getString(3));
            user.setAge(rs.getInt(4));
            try {
                users.add(user.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }
        rs.close();
        return users;
    }

    public User getUserFromDB(int id) throws SQLException {
        User user = new User();
        ResultSet rs = st.executeQuery("SELECT * FROM user WHERE id = '1'");
        while (rs.next()) {
            user.setName(rs.getString(2));
            user.setSurname(rs.getString(3));
            user.setAge(rs.getInt(4));
        }
        rs.close();
        return user;
    }

}
