package model;

import java.util.Date;

public class PaymentType {
    
    private int     id;
    private String  name;
    private Client  client;
    private Date    data;
    private int     value;

    public PaymentType(int id, String name, Client client, Date data, int value) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.data = data;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    
}
