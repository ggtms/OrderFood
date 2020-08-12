package com.ggtms.questionfour;

/**
 * @author ggtms
 * @ 2020-08-12 23:00
 */
public class GateWay {
    public static void main(String[] args) {
        // 安保操作
        SecurityOperation securityOperation = new SecurityOperation();
        // 开始工作
        securityOperation.morningOpen();
        // 工作结束
        securityOperation.eveningClose();
    }
}
