import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortedTest
{

   @Test
   public void test()
   {
      Sorted sort = new Sorted();
      int[] arr = {2, 2, 2, 3, 4, 6, 6, 7};

      assertTrue(sort.hasDuplicates(arr));
      
      assertEquals(5, sort.countDifferentElements(arr));
      
      int[] real = {2, 3, 4, 6, 7};
      assertArrayEquals(real, sort.removeDuplicates(arr));
   }

}
