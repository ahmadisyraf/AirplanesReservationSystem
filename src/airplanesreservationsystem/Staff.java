/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanesreservationsystem;

/**
 *
 * @author ahmadisyraf
 */
public class Staff extends User{
    
    private String email, department;
    
    
    public Staff(String email, String department, String username, String password){
        // Call constructor from superclass
        // To get value from superclass
        super(username, password);
        this.email = email;
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
