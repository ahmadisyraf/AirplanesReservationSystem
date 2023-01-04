/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Reservation {

    private String reservationId;
    private int quantity;
    private int age;
    private String bookingClass;
    private double totalPrice;
    private double discountPrice;

    // Aggregriation declaration
    private Schedule schedule;
    private Customer customer;

    public Reservation(String reservationId, int quantity, int age, String bookingClass, Customer customer, Schedule schedule) {
        this.reservationId = reservationId;
        this.quantity = quantity;
        this.age = age;
        this.bookingClass = bookingClass;
        // Implementation of aggregriation
        this.customer = customer;
        this.schedule = schedule;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getbookingClass() {
        return bookingClass;
    }

    public void setbookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public double calculatePrice() {
        if (getCustomer().getMembership().getMembership().equals("YES")) {

            setDiscountPrice(2.00);
            setTotalPrice((getSchedule().getPrice() * getQuantity() - getDiscountPrice()));

        } else {
            setTotalPrice((getSchedule().getPrice() * getQuantity()));
        }

        return getTotalPrice();

    }

}
