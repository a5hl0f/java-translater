package com.company;

public class FlatFactory {
    private int numberoOfFlatCreated;

    public FlatFactory() {
        numberoOfFlatCreated=0;
    }
    public Flat creatednewfLAT(String address, int confort, int area, int price){
        numberoOfFlatCreated++;
        return new Flat(numberoOfFlatCreated,address,confort,area,price);
    }
}
