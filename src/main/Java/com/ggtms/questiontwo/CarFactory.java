package com.ggtms.questiontwo;

/**
 * @author ggtms
 * @ 2020-08-05 12:33
 */

/**
 * 2、张三去奥迪4S店试驾汽车，需要试驾奥迪TT跑车，销售员为其提供一台TT张三试驾，
 * 张三又需要试驾一台Q7越野车，销售员又为其提供一台越野车试驾，
 * 请使用简单工厂模式描述上述行为
 */
public class CarFactory {
    public static Car getCar(String type) {
        if(type.equals("TT")){
            return new TT();
        }else if(type.equals("QSeven")){
            return new QSeven();
        }else{
            return null;
        }
    }
}
