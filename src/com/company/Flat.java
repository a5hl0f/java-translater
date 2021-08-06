package com.company;

public class Flat {
    private int id;
    private String address;
    private int confort;
    private int area;
    private int cost;

    public Flat(int id, String address, int confort, int area, int cost) {
        this.id = id;
        this.address = address;
        this.confort = confort;
        this.area = area;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", confort=" + confort +
                ", area=" + area +"msquare"+
                ", cost=" + cost +
                '}';
    }
}
