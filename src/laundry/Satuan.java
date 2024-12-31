/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author LENOVO
 */
public class Satuan extends Service{
    
    public Satuan(String serviceName, int duration, double price) {
        super(serviceName, duration, price);
    }
    
    @Override
    public double TotalPrice(double quantity) {
        return getPrice() * quantity;
    }
    
}
