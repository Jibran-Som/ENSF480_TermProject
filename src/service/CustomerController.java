// CustomerService.java
package service;

import model.*;
import backend.DatabaseManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {
    private DatabaseManager db = DatabaseManager.getInstance();

    public Customer createCustomer(String firstName, String lastName, CustomDate dob,
                                   String email, String phoneNumber) throws SQLException {
        // Insert into person table
        int personId = db.insertPerson(firstName, lastName, dob.toSQLDate(), "Customer");

        // Insert into customer table
        db.insertCustomer(personId, email);

        // Return customer object
        return new Customer(personId, firstName, lastName, dob, email);
    }

    public Customer getCustomer(int customerId) throws SQLException {
        return db.getCustomerById(customerId);
    }

    public ArrayList<Customer> getAllCustomersAsArray() throws SQLException {
        return db.getAllCustomers();
    }

    public void updateCustomer(Customer customer) throws SQLException {
        db.updatePerson(customer);
    }
}
