/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class AirplanesReservationSystem {

public static void main(String[] args) {
    
    new mainPageGUI().setVisible(true);
    
        System.out.println("+-------------------------------------------------+");
        System.out.println("|  Welcome to Airline Reservation System (STAFF)  |");
        System.out.println("+-------------------------------------------------+");

        Staff staff = new Staff("afiqhasif@gmail.com", "0169247176", "afqhsf", "Staffump@2019");

        System.out.println("CURRENT STAFF USERNAME : " + staff.getUsername());

        Flight[] flight = new Flight[3];
        Schedule[] schedule = new Schedule[3];

        flight[0] = new Flight("AIRASIA", "KUANTAN", "KUALA LUMPUR", "GATE A", 150, staff);
        flight[1] = new Flight("QATAR AIRWAYS", "KUANTAN", "TEREANGGANU", "GATE B", 150, staff);
        flight[2] = new Flight("ENG FLY", "KUANTAN", "KELANTAN", "GATE C", 150, staff);

        for (int i = 0; i < flight.length; i++) {
            String route = flight[i].getDeparture() + " >>> " + flight[i].getArrival();
            schedule[i] = new Schedule(route, "2 January", 11.00, 2.00, (i + 10), flight[i].getFlightName(), flight[i].getDeparture(), flight[i].getArrival(), flight[i].getGate(), flight[i].getCapacity(), staff);
        }

        System.out.println("<<< LIST OF FLIGHT >>>");

        for (int i = 0; i < flight.length; i++) {
            System.out.println((i + 1) + ". " + flight[i].getFlightName() + " | " + flight[i].getGate() + " | " + flight[i].getCapacity() + " SEATS");
        }

        System.out.println("\n");

        System.out.println("<<< LIST OF FLIGHT SCHEDULE  >>");

        for (int i = 0; i < flight.length; i++) {
            System.out.println((i + 1) + ". " + flight[i].getFlightName() + " | " + schedule[i].getRoute() + " | " + schedule[i].getFlightDate() + " | " + schedule[i].getDepartureDate() + " >>> " + schedule[i].getArrivalTime() + " | " + flight[i].getGate() + " | " + flight[i].getCapacity() + " SEATS LEFT");
        }

        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|  Welcome to Airline Reservation System (CUSTOMER)  |");
        System.out.println("+----------------------------------------------------+");

        Customer customer = new Customer("Isyraf", "0169247176", "isyrafmagic@gmail.com", 12, true, "isyrafmagic", "Studentump@2019");

        System.out.println("CURRENT CUSTOMER USERNAME : " + customer.getUsername());

        Reservation reservation = new Reservation("0001", 2, 21, "Business", customer, schedule[0]);

        Ticket ticket = new Ticket("TA1", "0001", reservation);

        ticket.displayDetails();

    }

}
