package com.ggtms.qusetionone;

import java.util.Calendar;

/**
 * @author ggtms
 * @ 2020-08-04 23:04
 */
public class GateWay {
    public static void main(String[] args) {
        // 创建一个停车场
        ChargeSystem chargeSystem = new ChargeSystem();
        // 造一辆小轿车
        Car airCar = new AirCar();
        // 录入驶入停车场时间
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020,8,5,17,29);
        // 录入驶出停车场时间
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020,8,5,20,30);
        // 收费
        double price = chargeSystem.charge(airCar, cal1, cal2);
        System.out.println("停车场收了"+ price +"元。");

    }
}
