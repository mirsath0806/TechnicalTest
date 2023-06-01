/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.technicaltest;

import java.util.Date;

/**
 *
 * @author S Mirsath
 */
public class Cal_Day {
private String date;
private String day;
private String ocassion;

    public Cal_Day(String date, String day, String ocassion) {
        this.date = date;
        this.day = day;
        this.ocassion = ocassion;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the ocassion
     */
    public String getOcassion() {
        return ocassion;
    }

    /**
     * @param ocassion the ocassion to set
     */
    public void setOcassion(String ocassion) {
        this.ocassion = ocassion;
    }



}
