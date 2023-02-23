package utility.collection;

public class Bucket
{
   private int[] bucket;
   private int count;
   
   public Bucket(int size)
   {
      bucket = new int[size];
      count = 0;
   }
   
   public void insert(int x)
   {
      if(count == bucket.length)
      {
         throw new IllegalStateException("Bucket is full!");
      }
      else 
      {
         bucket[count] = x;
         count++;
      }
   }
   
   public void sort()
   {
      for (int i=0; i < bucket.length  ; i++)
      {
      int indexOfMin = indexOfMin(i);
      swop(bucket, i, indexOfMin);
      System.out.println(bucket[i]);
      }
   }
   
   public int copyBucketInto(int[] A, int first)
   {
      int i;
      for(i = 0; i < bucket.length; i++)
      {
         A[first] = bucket[i];
         first++;
      }
      return i + 1;
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
