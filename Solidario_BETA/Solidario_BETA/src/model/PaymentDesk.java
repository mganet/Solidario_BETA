package model;

import java.util.Date;

public class PaymentDesk extends PaymentType{
    
    private Employee employee;

    public PaymentDesk(Employee employee, int id, String name, Client client, Date data, int value) {
        super(id, name, client, data, value);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
     
}
