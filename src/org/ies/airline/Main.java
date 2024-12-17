package org.ies.airline;

import org.ies.airline.components.AirlineReader;
import org.ies.airline.components.FlightReader;
import org.ies.airline.components.PassengerReader;
import org.ies.airline.model.Airline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);

        Airline airline = airlineReader.read();

        System.out.println(airline);

    }
}