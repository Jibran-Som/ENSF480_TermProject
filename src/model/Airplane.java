package model;

import java.util.ArrayList;

public class Airplane {

    private String name;
    private String status;
    private int flightNumber;
    private ArrayList<Route> routesFlying;

    public Airplane(String name, String status, int flightNumber, ArrayList<Route> routesFlying) {
        this.name = name;
        this.status = status;
        this.flightNumber = flightNumber;
        this.routesFlying = routesFlying;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public ArrayList<Route> getRoutesFlying() {
        return routesFlying;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setRoutesFlying(ArrayList<Route> routesFlying) {
        this.routesFlying = routesFlying;
    }

    public void addRoute(Route route){
        this.routesFlying.add(route);
    }

    public void removeRoute(Route route){
        this.routesFlying.remove(route);
    }
    
    @Override
    public String toString() {
        return "Airplane [name=" + name + ", status=" + status + ", flightNumber=" + flightNumber + ", routesFlying="
                + routesFlying + "]";
    }
}
