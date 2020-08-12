package com.ggtms.questionthree;

import java.util.Date;
import java.util.Scanner;
/**
 * @descroption 编写程序实现ATM机屏幕系统，用户录入密码，三次以上错误，
 * 提示锁定卡片并抛出密码错误异常，如果正确，显示用户卡信息（卡号，开办日期、余额）
 * @author ggtms
 * @ 2020-08-10 12:32
 */
public class GateWay {
    /**
     * 记录密码输入次数
     */
    public static int timeFlag = 0;

    public static void main(String[] args) throws Exception {
        //设置用户名&&密码
        User user = new User("ggtms","pwd");
        user.setAccount("6221888888888888888");
        user.setDate(new Date());
        user.setBalance(6666);

        Scanner sc = new Scanner(System.in);
        System.out.println("----------登录系统---------");

        while(true){
            System.out.println("输入用户名：");
            String inUser = sc.nextLine();
            System.out.println("输入密码：");
            String inPassword = sc.nextLine();
            if ((user.getUserName().equals(inUser)) && (user.getPassWord().equals(inPassword))) {
                System.out.println("*****登录成功，欢迎" + user.getUserName() + "进入ATM系统*****");
                System.out.println("卡号：" + user.getAccount() + "/n" +
                        "开办日期：" + user.getDate() + "/n" +
                        "余额：" + user.getBalance());
                break;
            }else if(++timeFlag >= 3){
                throw new Exception("密码错误");
            }
        }
    }
}
