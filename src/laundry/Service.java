/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author LENOVO
 */
public class Service {
    private String serviceName;
    private int duration;
    private double price;

    public Service(String serviceName, int duration, double price) {
        this.serviceName = serviceName;
        this.duration = duration;
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double TotalPrice(double quantity){
        return price * quantity;
    }
}

