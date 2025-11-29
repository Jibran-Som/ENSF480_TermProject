import backend.*;
import model.*;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        DatabaseManager db = DatabaseManager.getInstance();
        db.connect("admin_user", "admin_password");

        Date date = new Date();
        Customer customer = new Customer("Jess", "Smith", date);


    }
}
