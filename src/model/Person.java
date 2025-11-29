// Person.java
package model;

public abstract class Person {
    private int id;
    private String firstName;
    private String lastName;
    private CustomDate DoB;

    public Person(String firstName, String lastName, CustomDate DoB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
    }

    public Person(int id, String firstName, String lastName, CustomDate DoB) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public CustomDate getDoB() { return DoB; }

    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setDoB(CustomDate DoB) { this.DoB = DoB; }

    public abstract String toString();
}
