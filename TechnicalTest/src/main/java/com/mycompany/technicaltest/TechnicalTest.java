/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.technicaltest;

import java.util.Scanner;

/**
 *
 * @author S Mirsath
 */
public class TechnicalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Start Date(dd-mm-yyyy):");
        String date = sc.next();
        System.out.println("Please enter the Number of Days to Complete:");
        int numbers = sc.nextInt();
        if (numbers > 0) {
            Cal_Day c = Main.getM().run(date, numbers);
            if (c != null) {
                System.out.println("Completion Date of the Task: " + c.getDate());
            }
        } else {
            System.out.println("Please add the correct Number of Days");
        }
    }
}
