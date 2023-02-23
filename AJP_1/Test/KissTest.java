import static org.junit.Assert.*;

import org.junit.Test;


public class KissTest
{

   @Test
   public void testNumberOfKisses()
   {
      Kiss k = new Kiss();
      assertEquals("Number of kisses for 1 should be 0", 0, k.numberOfKisses(1));
   }

}
