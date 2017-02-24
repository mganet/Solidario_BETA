package model;

import java.util.Date;

public class PaymentMB extends PaymentType{
    
    private String bank;
    private String iban;

    public PaymentMB(String bank, String iban, int id, String name, Client client, Date data, int value) {
        super(id, name, client, data, value);
        this.bank = bank;
        this.iban = iban;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    
    
}
