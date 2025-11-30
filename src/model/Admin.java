// Admin.java
package model;

public class Admin extends Person {
    public Admin(int id, String username, String firstName, String lastName, CustomDate DoB) {
        super(id, username, firstName, lastName, DoB);
    }

    public Admin(String username, String firstName, String lastName, CustomDate DoB) {
        super(username, firstName, lastName, DoB);
    }

    @Override
    public String toString() {
        return "Admin{id=" + getId() + ", username='" + getUsername() + "', name=" + getFirstName() + " " + getLastName() + "}";
    }
}