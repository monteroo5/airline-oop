package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String name;
    private Flight[] flights;

    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public void showFlights() {
        System.out.println("Nombre del aeropuerto: " + name +
                "Vuelos: " + flights);
    }

    public void showFlightsfromOrigin(String origin) {
        System.out.println("Nombre del aeropuerto: " + name +
                "Vuelos: " + flights + "Origen: " + origin);
    }

    public Flight findFlight(int flightNumber) {
        for (var flight : flights) {
            if (flight.getFlightNumber() == (flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public Flight showPassengerFlights(String nif) {
        for (var flight : flights) {
            if (flight.getPassengers().equals(nif)) {
                showFlights();
            }
        }
        return null;
    }

    public Flight getPassengerSeat(int flightNumber, String nif) {
        for (var flight : flights) {
            if (flight.hasPassenger(nif) && flight.getFlightNumber() == flightNumber)  {
                showPassengerFlights(nif);
            }
        }
        return null;
    }

    public void updateSeatNumber (int flightNumber, String nif,int seatNumber) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
