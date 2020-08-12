package com.ggtms.questionfive;

import java.util.Scanner;

/**
 * @author ggtms
 * @description 从键盘接收用户信息，进行注册并验证
 *1)填入姓名：要求字符串长度必须是2-4位
 *2)填入电话:要求必须是11位长，必须以13、14、15、16、17、18、19开头
 *3)填入身份证：要求前17位必须是数字，最后1位必须是数字或者X
 *4)根据身份证显示当前用户的出生日期(yyyy-MM-dd)、以及性别
 * @ 2020-08-12 23:15
 */
public class GateWay {

    public static void main(String[] args) {

        // 创建一个用户
        User user = new User();

        // 输入用户信息并校验
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        // 校验用户名
        while (true){
            String name = sc.next();
            if(name.length() > 2 && name.length() < 4){
                user.setUserName(name);
                break;
            }else {
                System.out.println("输入用户的姓名长度不符，请重新输入！");
            }
        }

        System.out.print("请输入电话号码：");
        // 校验电话号码
        boolean flag = true;
        while(flag){
            String number = sc.next();
            if(number.length() != 11){
                System.out.println("号码长度有误！请重新输入。");
                continue;
            }else if(number.startsWith("13") | number.startsWith("14") | number.startsWith("15")
                    | number.startsWith("16") | number.startsWith("17") | number.startsWith("18")
                    | number.startsWith("19")){
                user.setPhone(number);
                flag = false;
            }else {
                System.out.println("号码格式错误，请重新输入！");
            }
        }

        System.out.print("请输入身份证号：");
        // 校验身份证，判断性别
        // TODO
        while(true){
            String idCard = sc.next();
            // 判断前17位为数字
            for (int i = 0; i < 17; i++) {
                if(!Character.isDigit(idCard.charAt(i))){
                    System.out.println("输入的身份证不合法！");
                    i = 17;
                }
            }
            // 判断最后一位的合法性
            if(idCard.endsWith("X") | Character.isDigit(idCard.charAt(idCard.length()-1))) {
                user.setIdCard(idCard);
                break;
            }else {
                System.out.println("输入的身份证不合法!请重新输入。");
            }
        }
        // 判断性别
        if (Integer.parseInt(user.getIdCard().substring(16).substring(0, 1)) % 2 == 0) {
            user.setSex("女");
        }else {
            user.setSex("男");
        }
        // 获取出生日期(yyyy-MM-dd)
        // 身份证上的年份
        String year = user.getIdCard().substring(6).substring(0, 4);
        // 身份证上的月份
        String month = user.getIdCard().substring(10).substring(0, 2);
        // 身份证上的日期
        String day = user.getIdCard().substring(12).substring(0,2);
        user.setBirthday(year+"年"+month+"月"+day+"日");
        // 显示出生日期
        System.out.print("您的生日是：" + user.getBirthday().toString());
    }
}
