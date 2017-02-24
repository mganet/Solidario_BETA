package model;

import java.util.ArrayList;
import java.util.Date;

public class PaymentService extends PaymentType{
    
    private ArrayList<Service> service;
    private int hours;

    public PaymentService(ArrayList<Service> service, int hours, int id, String name, Client client, Date data, int value) {
        super(id, name, client, data, value);
        this.service = service;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ArrayList<Service> getService() {
        return service;
    }

    public void setService(ArrayList<Service> service) {
        this.service = service;
    }
    
    
    
    
    
}
