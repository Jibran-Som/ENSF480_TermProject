// FlightService.java
package service;

import model.*;
import backend.DatabaseManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FlightController {
    private DatabaseManager db = DatabaseManager.getInstance();

    public Flight createFlight(Airplane airplane, Route route, CustomDate departureCustomDate,
                               CustomDate arrivalCustomDate, int availableSeats, String flightTime, float price) throws SQLException {
        int flightId = db.insertFlight(airplane.getAirplaneID(), route.getRouteID(),
            departureCustomDate, arrivalCustomDate, availableSeats, flightTime, price);
        return new Flight(flightId, airplane, route, departureCustomDate, arrivalCustomDate, availableSeats, flightTime, price);
    }

    public ArrayList<Flight> getAllFlights() throws SQLException {
        return db.getAllFlights();
    }

    public Flight getFlight(int flightId) throws SQLException {
        return db.getFlightById(flightId);
    }

    public ArrayList<Flight> searchFlights(String originCity, String destinationCity, CustomDate customDate) throws SQLException {
        // Implementation for flight search
        ArrayList<Flight> allFlights = getAllFlights();
        ArrayList<Flight> results = new ArrayList<>();

        for (Flight flight : allFlights) {
            // Simplified search logic
            if (flight.getDepartureDate().toString().equals(customDate.toString())) {
                results.add(flight);
            }
        }
        return results;
    }



    // Add this to your DatabaseManager.java

}
