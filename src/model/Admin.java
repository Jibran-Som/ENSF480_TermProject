// Admin.java
package model;

public class Admin extends Person {
    public Admin(int id, String firstName, String lastName, CustomDate DoB) {
        super(id, firstName, lastName, DoB);
    }

    public Admin(String firstName, String lastName, CustomDate DoB) {
        super(firstName, lastName, DoB);
    }

    @Override
    public String toString() {
        return "Admin{id=" + getId() + ", name=" + getFirstName() + " " + getLastName() + "}";
    }
}
