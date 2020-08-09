package com.ggtms.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ggtms
 * @ 2020-07-14 9:36
 */
public class test {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println
        );
        System.out.println(",,,,");
        /* //1.生成随机数
        int max = 100,min = 1;
        //int randomWithMathRandom = (int) ((Math.random() * (max - min)) + min);
        int a = 0 ;
        int ran = (int) ((Math.random()*(100)) );
        for (int i = 0; i < 120; i++) {

            int t = (int)(Math.random()*11);
            System.out.println(t);
        }

        int gussNumber,n = 100;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int m = sc.nextInt();
            if (m > ran) {
                System.out.println("大了");
            } else if (m < ran) {
                System.out.println("小了");
            } else if (m == ran) {
                System.out.println("猜对了您嘞！");
                break;
            }
        }*/

       /*//找字串出现次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符主串：");
        String mainStr = sc.next();
        System.out.println("请输入字符子串：");
        String subStr = sc.next();
        int subLength = subStr.length();
        int index = 0;    // 开始比较的下标
        int count = 0;    // 记录字串出现的次数
        // 校验(判断对象是否为null)

        while((index = mainStr.indexOf(subStr,index)) != -1){      // -1表示遍历完整个字符主串
            count++;
            index +=subLength;
        }
        System.out.println("出现次数" + count);*/

        ArrayList list = new ArrayList();
        for (int i = 0; i < 10 ; i++) {

            list.add(random.nextInt());
            System.out.println(list.get(i));
        }

        //333list.add()
    }


    /**
     * 字符类型的文件复制
     */

    public void fileCopy(){
        // 造流
        FileReader fr = null;
        FileWriter fw = null;
        System.out.println();

        try {
            // 造文件对象
            File srcFile = new File("src/main/test");
            File destFile = new File("src/main/destTest");
            // 造输入输出流的对象(要确保文件的存在)
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 进行数据的读入和写出操作
            char[] buffer = new char[5];
            int len;                  // 记录每次读入到buffer数组中的字符个数
            while((len = fr.read(buffer)) != -1){               // 当fr中的字符读完时
                fw.write(buffer,0,len);       // 每次从fr向fw中写入len个字符（写入该字符数组的一部分。）
                System.out.println(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {              // 关闭流
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**猜数游戏*/
    public void testGuss(){
        //1.生成随机数
        int max = 100,min = 1;
        int a = 0 ;
        int ran = (int) ((Math.random()*(100)) );
        int gussNumber,n = 5;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while(true) {
            if (m > ran) {
                System.out.println("大了");
            } else if (m < ran) {
                System.out.println("小了");
            } else if (m == ran) {
                System.out.println("猜对了您嘞！");
                break;
            }
            n--;
        }
    }
    /**
     * 获取字串在主串中的出现次数
     *
     */
    public void countStr(){
        Scanner sc = new Scanner(System.in);
        String mainStr = sc.next();
        String subStr = sc.next();
        int subLength = subStr.length();
        int index = 0;    // 开始比较的下标
        int count = 0;    // 记录字串出现的次数
        while((index = mainStr.indexOf(subStr,index)) != -1){      // -1表示遍历完整个字符主串
            count++;
            index +=subLength;
        }
        System.out.println(count);
    }
}
