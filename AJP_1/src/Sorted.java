
public class Sorted
{
   
   /*
    * Goes through the array, checking if any numbers are duplicates. 
    * Returns a boolean indicating if its the case. 
    * 
    * The array must not be empty.
    * 
    * It goes through each number but the last and checks if its equal to the next one.
    * If so, it changes the value of a boolean (which is set to false by default) and 
    * at the end returns it.
    */
   public static boolean hasDuplicates(int[] arr)
   {
      if(arr.length == 0)
            throw new IllegalStateException("Array is empty!");
      boolean is = false;
      for(int i = 0; i < arr.length - 1; i++)
      {
         if(arr[i] == arr[i + 1])
         {
            is = true;
            break;
         }
      }
      return is;
   }
   
   /*
    * Counts how many unique elements there are in the array.
    * Returns an int with the value.
    * 
    * Array must not be empty.
    * 
    * Goes through the array, adding to the count each time it encounters 
    * a number that is not equal to the next. At the end it also
    * adds the last element of the array and returns the count.
    */
   public static int countDifferentElements(int[] arr)
   {
      if(arr.length == 0)
            throw new IllegalStateException("Array is empty!");
      int count = 0;
      for(int i = 0; i < arr.length - 1; i++)
      {
         if(arr[i] != arr[i + 1])
         {
            count++;
         }
      }
      count ++;
      return count;
   }
   
   
   /*
    * Return a new array with the same values as the original
    * but with their duplicates removed.
    * 
    * Array must not be empty.
    * 
    * First it checks the count of different elements of the given array,
    * then creates a new array with that length. Afterwards it checks the 
    * original array for unique elements and adds them one by one
    * to the new array which it then returns.
    */
   public static int[] removeDuplicates(int[] arr)
   {
      if(arr.length == 0)
      {
         throw new IllegalStateException("Array is empty!");
      }
      int length = countDifferentElements(arr);
      int[] newArr = new int[length];
      int count = 0;
      
      for(int i = 0; i < arr.length - 1; i++)
      {
         if(arr[i] != arr[i + 1])
         {
            newArr[count] = arr[i];
            count++;
         }
      }
      newArr[length - 1] = arr[arr.length - 1];
      return newArr;
   }
}
