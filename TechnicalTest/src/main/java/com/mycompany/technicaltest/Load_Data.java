/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.technicaltest;

import java.util.ArrayList;

/**
 *
 * @author S Mirsath
 */
public class Load_Data {
     public static ArrayList<Cal_Day> loadData(){
        ArrayList<Cal_Day> data =new ArrayList<Cal_Day>();
        Cal_Day c1= new Cal_Day("19-08-2022", "Friday", "");
        Cal_Day c2= new Cal_Day("20-08-2022", "Saturday", "");
        Cal_Day c3= new Cal_Day("21-08-2022", "Sunday", "");
        Cal_Day c4= new Cal_Day("22-08-2022", "Monday", "");
        Cal_Day c5= new Cal_Day("23-08-2022", "Tuesday", "Poya Day");
        Cal_Day c6= new Cal_Day("24-08-2022", "Wednesday", "");
        Cal_Day c7= new Cal_Day("25-08-2022", "Thursday", "");
        Cal_Day c8= new Cal_Day("26-08-2022", "Friday", "");
        Cal_Day c9= new Cal_Day("27-08-2022", "Saturday", "");
        Cal_Day c10= new Cal_Day("28-08-2022", "Sunday", "");
        
        data.add(c1);
        data.add(c2);
        data.add(c3);
        data.add(c4);
        data.add(c5);
        data.add(c6);
        data.add(c7);
        data.add(c8);
        data.add(c9);
        data.add(c10);
        
        return data;
    }
}
