// Customer.java
package model;

public class Customer extends Person {
    private Address address;
    private String email;
    private String phoneNumber;

    public Customer(String firstName, String lastName, CustomDate DoB, Address address, String email, String phoneNumber) {
        super(firstName, lastName, DoB);
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Customer(int id, String firstName, String lastName, CustomDate DoB, String email) {
        super(id, firstName, lastName, DoB);
        this.email = email;
        this.phoneNumber = "";
        this.address = null;
    }

    public Customer(String firstName, String lastName, CustomDate DoB) {
        super(firstName, lastName, DoB);
        this.email = "";
        this.phoneNumber = "";
        this.address = null;
    }

    public Address getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setAddress(Address address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "Customer{id=" + getId() + ", firstName='" + getFirstName() + "', lastName='" + getLastName() +
            "', email='" + email + "', phone='" + phoneNumber + "'}";
    }
}
