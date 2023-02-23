package utility.collection;

public class Test
{
   public static void main(String args[])
   {
      int[] A = {25, 38, 6, 3, 11, 19, 32, 30, 36, 26, 40, 17, 14, 13, 5, 4, 7, 20, 28, 2,
                 39, 23, 33, 1, 15, 10, 8, 37, 16, 12, 24, 9, 18, 22, 34, 27, 29, 21, 35, 31};
      Sort sort = new Sort();
      
      sort.bucketSort(A, 10);
   }
}
