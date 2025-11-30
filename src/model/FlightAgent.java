// FlightAgent.java
package model;

import java.util.ArrayList;

public class FlightAgent extends Person {
    private ArrayList<Customer> clients;

    public FlightAgent(int id, String username, String firstName, String lastName, CustomDate DoB, ArrayList<Customer> clients) {
        super(id, username, firstName, lastName, DoB);
        this.clients = clients;
    }

    public FlightAgent(String username, String firstName, String lastName, CustomDate DoB) {
        super(username, firstName, lastName, DoB);
        this.clients = new ArrayList<>();
    }

    public ArrayList<Customer> getClients() { return clients; }
    public void setClients(ArrayList<Customer> clients) { this.clients = clients; }

    public void addClient(Customer customer) { this.clients.add(customer); }
    public void removeClient(Customer customer) { this.clients.remove(customer); }

    @Override
    public String toString() {
        return "FlightAgent{id=" + getId() + ", username='" + getUsername() + "', name=" + getFirstName() + " " + getLastName() +
            ", clients=" + clients.size() + "}";
    }
}