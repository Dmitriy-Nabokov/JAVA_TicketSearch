package org.example;

public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected String from;
    protected String to;
    protected int price;
    protected int duration;

    public Ticket(int id, String from, String to, int price, int duration) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override

    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        }
        if (price > o.getPrice()) {
            return 1;
        }
        return 0;
    }
}
