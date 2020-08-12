package com.ggtms.questionthree;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * @author ggtms
 * @ 2020-08-10 12:47
 */
@Data
public class User {

    private String userName;
    private String passWord;
    private double balance;
    private Date date;
    private String account;

    public User(String userName,String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
}
