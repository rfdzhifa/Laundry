package laundry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arsan
 */
public class Employee extends Person {
    private String role;
    private String username;
    private String password;

    // Constructor
    public Employee(String id, String name, String phone, String role, String username, String password) {
        super(id, name, phone);
        this.role = role;
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
