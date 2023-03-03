package ajp.sort;

public class Run
{
   public static void main(String[] args)
   {
      SelectionSort sort = new SelectionSort();
      
      int[] array = {5, 9, 6, 8, 1};
      sort.selectionSort(array);
      
     /* for(int i = 0; i < array.length; i++)
      {
         System.out.println(array[i]);
      }
      */

   }
}
