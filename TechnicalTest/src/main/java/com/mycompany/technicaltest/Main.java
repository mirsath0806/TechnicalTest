/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.technicaltest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S Mirsath
 */
public class Main {
    private static Main m;
    private Main(){
        
    }
    
    public static Main getM(){
        if(m==null){
            synchronized (Main.class) {
                if(m==null){
                  m=new Main();  
                }
            }
        }
        return m;
    }
    public  Cal_Day run(String d,int c){
        
         ArrayList<Cal_Day> data=Load_Data.loadData();
        int count=data.size();
        
        
        String date=d;
       
        int numbers=c;
        Cal_Day out=null;
        try{
        for (int i = 0; i < count; i++) {
            Cal_Day cd=data.get(i);
            if(cd.getDate().equals(date)){
                int st=i+numbers;
                for (int j = i; j < st; j++) {
                    Cal_Day scd=data.get(j);
                    if(scd.getDay()=="Saturday" || scd.getDay()=="Sunday" ){
                        st+=1;
                    }else{
                        if(scd.getOcassion()==""){
                            out=scd;
                        }else{
                           st+=1; 
                        }
                    }
                    
                }
                
                break;
            }
        }
        } catch(Exception e){
            out=null;
            System.out.println("Add the day count in the limit of Data");
            return out;
        }
        if(out ==null){
            System.out.println("You enetered the wrong date or date format"); 
        }
        return out;
        
    }
    
    
    
}
