package com.ggtms.qusetionone;

import java.util.Calendar;

/**
 * @author ggtms
 * @ 2020-08-04 18:59
 * 1、编写停车场收费系统，系统会根据车型的不同收取不同的停车费，
 *  客车：15元/小时
 *  轿车：8元/小时
 *  不足1小时，按1小时收费
 * 现有一辆宝马轿车，17:29入场，20:30离场，求该车辆应该交多少钱
 */

public class ChargeSystem {
    /**
     * 停车场的容量
     */
    private int count;

    public ChargeSystem(int count) {

        this.count = count;
        System.out.println("我是能装下"+ count +"俩车的停车场！");
    }

    public ChargeSystem() {
        System.out.println("我是停车场。");
    }

    /**
     *
     * @param car 当前停车类型
     * @param innerDate 驶入停车场时间
     * @param outDate 驶出停车场时间
     * @return 产生的费用
     */
    public double charge(Car car, Calendar innerDate, Calendar outDate){
        double apply =  car.getParkingPee() * car.getHours(innerDate, outDate);
        return apply;
    }
}
