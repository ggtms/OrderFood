package com.ggtms.questiontwo;

/**
 * @author ggtms
 * @ 2020-08-05 14:31
 */
public class GateWay {
    public static void main(String[] args) {
        Car fastCar = CarFactory.getCar("TT");
        fastCar.apply();
        fastCar.provide();
        fastCar.drive();

        Car slowCar = CarFactory.getCar("QSeven");
        slowCar.apply();
        slowCar.provide();
        slowCar.drive();
    }
}
