package model;

public class Card {

    private String number;
    private String holder;
    private String expiry;
    private String cvv;

    public Card(String number, String holder, String expiry, String cvv) {
        this.number = number;
        this.holder = holder;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getCvv() {
        return cvv;
    }
}
