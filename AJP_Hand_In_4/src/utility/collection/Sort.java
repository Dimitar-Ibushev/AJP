package utility.collection;

public class Sort
{
      
   public static void bucketSort(int[] A, int m)
   {
      int current = 0;
      int count = 0;

      Bucket first = new Bucket(10);
      for(int i = 0; i < A.length; i++)
      {

         if(A[i] >= 0 && A[i] < 11)
         {
            first.insert(A[i]);
            count++;
         }
         if(count == 10)
         break;
      }
      first.sort();
      first.copyBucketInto(A, current);
      
      current = current + m;
      
      Bucket second = new Bucket(10);
      
      count = 0;
      for(int i = 0; i < A.length; i++)
      {
         if(A[i] > 10 && A[i] < 21)
         {
            second.insert(A[i]);
            count++;
         }
         if(count == 10)
         break;
      }
      second.sort();
      second.copyBucketInto(A, current);
      
      current = current + m;
      
      Bucket third = new Bucket(10);
      
      count = 0;
      for(int i = 0; i < A.length; i++)
      {

         if(A[i] > 20 && A[i] < 31)
         {
            third.insert(A[i]);
            count++;
         }
         if(count == 10)
         break;
      }
      third.sort();
      third.copyBucketInto(A, current);
      
      current = current + m;
      
      Bucket fourth = new Bucket(10);
      
      count = 0;
      for(int i = 0; i < A.length; i++)
      {

         if(A[i] > 30 && A[i] < 41)
         {
            fourth.insert(A[i]);
            count++;
         }
         if(count == 10)
         break;
      }
      fourth.sort();
      fourth.copyBucketInto(A, current);
      
      
   }
}
