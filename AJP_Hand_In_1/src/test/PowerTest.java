package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.math.Power;

public class PowerTest
{
   @Test
   public void test()
   {
      Power math = new Power();
      
      //basic test of first method
      assertEquals(math.power(5, 3), 125); 
      
      //basic test of second method
      assertEquals(math.power1(5, 3), 125);
      
      //Question 1.4 and full testing of third method
      try
      {
         assertEquals(math.power2(5, -3), -125); //catches a negative power value
      }
      catch(IllegalArgumentException e)
      {
         //exception caught
      }
      
      assertEquals(math.power2(5, 0), 1); //power 0 equals 1
      assertEquals(math.power2(-5, 4), 625); //even power; negative on even power equals positive
      assertEquals(math.power2(-5, 3), -125); //uneven power; negative on uneven power equals negative
      assertEquals(math.power2(200, 2), 40000); //positives on even power
      assertEquals(math.power2(30, 3), 27000); //positives on uneven power
      System.out.println("Test ended");
   }

}
