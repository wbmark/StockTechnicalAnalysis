/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.brown.cs32.lyzhang.crassus.backend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lyzhang
 */
public class StockHistDataWeeklyTest {
    
    public StockHistDataWeeklyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of getHistData method, of class StockHistDataWeekly.
     */
    @Test
    public void testGetHistData() {
         System.out.println("getHistData");

        StockHistDataWeekly instance = new StockHistDataWeekly("msft");
        instance.Init();

        List<StockTimeFrameData> allHistData = instance.getHistData();
        StockTimeFrameData firstDay = allHistData.get(0);
        assert(firstDay.getTime().equals("1986-03-13"));        
     
   
    }

}
