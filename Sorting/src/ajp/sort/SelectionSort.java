package ajp.sort;

public class SelectionSort
{   
   public static void selectionSort(int[] array)
   {
    for (int i=0; i < array.length  ; i++)
    {
    int indexOfMin = indexOfMin(i);
    swop(array, i, indexOfMin);
    System.out.println(array[i]);
    }
   }
   

   private static void swop(int[] a, int i, int indexOfMin)
   {
      for (int j = i + 1; j < a.length; j++)
      {
         if(a[j] < a[indexOfMin])
         {
           indexOfMin = j;
         }

         int temp = a[i];
         a[i] = a[indexOfMin];
         a[indexOfMin] = temp;
         
         }      
   }

   private static int indexOfMin(int i)
   {
      return i;
   }
   
}
