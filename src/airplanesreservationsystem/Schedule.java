/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Schedule {

    private String route, flightDate;
    private double departureDate, arrivalTime, price;

    // Composition declaration
    private Flight flight;

    // Constructor with parameter
    public Schedule(String route, String flightDate, double departureDate, double arrivalTime, double price, String flightName, String departure, String arrival, String gate, int capacity, Staff staff) {
        this.route = route;
        this.flightDate = flightDate;
        this.departureDate = departureDate;
        this.arrivalTime = arrivalTime;
        this.price = price;
        // Implementation of composition
        // Object in class
        flight = new Flight(flightName, departure, arrival, gate, capacity, staff);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public double getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(double departureDate) {
        this.departureDate = departureDate;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
