package com.ggtms.questiontwo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author ggtms
 * @ 2020-08-05 14:31
 */
public class TT implements Car {
    @Override
    public void apply() {
        System.out.println("申请一辆TT");
    }

    @Override
    public void provide() {
        System.out.println("销售人员提供一辆TT车型");
    }

    @Override
    public void drive() {
        System.out.println("成功试驾TT，nice!!!");
    }
}
