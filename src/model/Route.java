// Route.java
package model;

public class Route {
    private int routeId;
    private Address departureLocation;
    private Address arrivalLocation;

    public Route(Address departureLocation, Address arrivalLocation) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    public Route(int routeId, Address departureLocation, Address arrivalLocation) {
        this.routeId = routeId;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    public int getRouteID() { return routeId; }
    public Address getDepartureLocation() { return departureLocation; }
    public Address getArrivalLocation() { return arrivalLocation; }

    public void setRouteID(int routeId) { this.routeId = routeId; }
    public void setDepartureLocation(Address departureLocation) { this.departureLocation = departureLocation; }
    public void setArrivalLocation(Address arrivalLocation) { this.arrivalLocation = arrivalLocation; }

    @Override
    public String toString() {
        return "Route{id=" + routeId + ", from=" + departureLocation.getCity() +
            ", to=" + arrivalLocation.getCity() + "}";
    }
}
