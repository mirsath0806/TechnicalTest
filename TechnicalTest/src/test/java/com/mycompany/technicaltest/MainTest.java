/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.technicaltest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S Mirsath
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testRunMethod() {
        Cal_Day c=Main.getM().run("19-08-2022", 5);
        String expected="26-08-2022";
        String actual=c.getDate();
        assertEquals(expected,actual);
    }
    
}
