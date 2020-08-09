package com.ggtms.qusetionone;

import java.util.Calendar;

/**
 * @author ggtms
 * @ 2020-08-04 23:13
 */
public class Car {
    /**
     * 停车费
     */
    private double ParkingPee;

    public double getParkingPee() {
        return ParkingPee;
    }

    public void setParkingPee(double parkingPee) {
        ParkingPee = parkingPee;
    }

    /**
     *
     * @param innerDate 驶入停车场时间
     * @param outDate 驶出停车场时间
     * @return 停车花费的时间
     */
    public int getHours(Calendar innerDate, Calendar outDate){
        // 获取时
        int hour1= innerDate.get(Calendar.HOUR_OF_DAY);
        int hour2 = outDate.get(Calendar.HOUR_OF_DAY);
        // 获取分
        int miu1 = innerDate.get(Calendar.MINUTE);
        int miu2 = outDate.get(Calendar.MINUTE);
        // 计算停车时长
        if((miu2 - miu1) > 0){
            return hour2 - hour1 + 1;
        }else{

            return hour2 - hour1;
        }
    }
}
