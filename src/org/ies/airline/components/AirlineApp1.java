package org.ies.airline.components;

import org.ies.airline.model.Airline;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private AirlineReader airlineReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public void run() {
        Airline airline = airlineReader.read();

        System.out.println("Introduce un número de vuelo:");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();



    }
}
