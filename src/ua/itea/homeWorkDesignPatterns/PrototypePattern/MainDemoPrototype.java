package ua.itea.homeWorkDesignPatterns.PrototypePattern;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * Use prototype pattern for take user from DB and clone it;
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/27/17
 */
public class MainDemoPrototype {

    public static void main(String[] args) throws CloneNotSupportedException, SQLException, ClassNotFoundException {

        //First variant: create one user and clone it for create another user without operator new
        User user1 = new User("Vasya", "Petrov", 35);

        User user2 = user1.clone();
        user2.setName("Petya");
        user2.setSurname("Sidorov");
        user2.setAge(39);

        System.out.println(user1);
        System.out.println(user2);

        //Second variant: create one user and make clone for create another users from DB an add there to list
        MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
        List<User> users = myConnectionToDB.getUsers();
        System.out.println(users);

        //Third variant: create one user from DB and clone it and rewrite
        User user3 = myConnectionToDB.getUserFromDB(1);
        User user4 = user3.clone();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        user4.setName(scan.nextLine());
        System.out.println("Enter surname: ");
        user4.setSurname(scan.nextLine());
        System.out.println("Enter age: ");
        user4.setAge(scan.nextInt());
        System.out.println(user3);
        System.out.println(user4);
    }
}
