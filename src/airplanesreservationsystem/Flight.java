/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Flight {

    private String flightName, departure, arrival, gate;
    private int capacity;
    private Staff staff;

    public Flight(String flightName, String departure, String arrival, String gate, int capacity, Staff staff) {
        this.flightName = flightName;
        this.departure = departure;
        this.arrival = arrival;
        this.gate = gate;
        this.capacity = capacity;
        this.staff = staff;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

}
