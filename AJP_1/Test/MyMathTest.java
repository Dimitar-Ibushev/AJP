import static org.junit.Assert.*;

import org.junit.Test;


public class MyMathTest
{

   @Test
   public void testMyMath()
   {
      MyMath math = new MyMath();
      assertEquals("Sum of 8 should be 36", 36, math.sum(8));
   }
}
