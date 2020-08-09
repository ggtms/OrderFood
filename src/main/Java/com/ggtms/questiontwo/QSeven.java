package com.ggtms.questiontwo;

/**
 * @author ggtms
 * @ 2020-08-05 14:33
 */
public class QSeven implements Car {
    @Override
    public void apply() {
        System.out.println("申请一辆Q7车型");
    }

    @Override
    public void provide() {
        System.out.println("销售人员提供一辆Q7车型");
    }

    @Override
    public void drive() {
        System.out.println("成功试驾Q7，just so so!!!");
    }
}
