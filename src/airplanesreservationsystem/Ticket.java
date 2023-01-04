/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Ticket extends Invoice {

    protected String ticketId;
    protected Reservation reservation;

    public Ticket(String ticketId, String invoiceId, Reservation reservation) {
        super(invoiceId);
        this.ticketId = ticketId;
        this.reservation = reservation;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void displayDetails() {
        // Insert here
        System.out.println("\n");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|------------------------TICKET----------------------|");
        System.out.println("+----------------------------------------------------+");
        System.out.println("Name                       : " + reservation.getCustomer().getName());
        System.out.println("Phone                      : " + reservation.getCustomer().getPhoneNum());
        System.out.println("Membership                 : " + reservation.getCustomer().getMembership().getMembership() + "\n");
        System.out.println("Flight                     : " + reservation.getSchedule().getRoute());
        System.out.println("Date                       : " + reservation.getSchedule().getFlightDate());
        System.out.println("Departure                  : " + reservation.getSchedule().getDepartureDate());
        System.out.println("Reservation class          : " + reservation.getBookingClass());
        System.out.println("Gate                       : " + reservation.getSchedule().getFlight().getGate());
        System.out.println("Price ticket               : RM " + reservation.getSchedule().getPrice());
        System.out.println("Total customer             : " + reservation.getQuantity());
        System.out.println("Total price after discount : RM " + reservation.calculatePrice());
    }

}