package ajp.sort;

import java.lang.reflect.Array;

public class Methods
{
   public int indexOfMin(int[] a, int i)
   {
      return a[i];
   }
   public void swop(int[] a, int i, int indexOfMin)
   {
      for (int j = i; j < i; j++)
      {
         if(a[indexOfMin] < a[i])
         {
            int temp = a[i];
            a[i] = a[indexOfMin];
            a[indexOfMin] = temp;
         }
      }
   }
}
