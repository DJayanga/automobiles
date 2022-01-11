package com.company;

public class Main {

    private static Cars car;
    private static Bikes bike;

    public static void main(String[] args) {

        Cars car = new Cars();
        Bikes bike = new Bikes();

        car.key();
        bike.kick();
    }
}
