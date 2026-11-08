package org.example;

public class Ticket {
    String event;
    int seatNumber;
    double price;

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public void show() {
        System.out.println("Событие: " + event + ", место: " + seatNumber + ", цена: " + price + " руб.");
    }
}