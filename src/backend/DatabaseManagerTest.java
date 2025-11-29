package backend;

import model.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseManagerTest {
    public static void main(String[] args) {
        DatabaseManager db = DatabaseManager.getInstance();

        try {
            db.connect("admin_user", "user_password"); // replace with actual password
            Customer customer = new Customer("Jack", "Smith", new Date());
            System.out.println("Customer created: " + customer);
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
    }
}

