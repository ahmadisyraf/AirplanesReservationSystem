/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Customer extends User {

    private String name;
    private String phoneNum;
    private String email;
    private int age;

    // Composition declaration
    private Membership membership;

    // Construtor with parameter
    // All value will be pass thru object 
    public Customer(String name, String phoneNum, String email, int age, Boolean mmbership, String username, String password) {
        super(username, password);
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.age = age;
        // Object in constructor means composition
        membership = new Membership(mmbership);
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
