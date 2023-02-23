
public class Q11
{
   //Q1.1
   public static double dotProductIterative(double[] v, double[] w)
   {
      double returned = 0;
      for(int i = 0; i < w.length; i++)
      {
         returned += v[i] * w[i];
      }
      return returned;
   }
   
   //Q1.2
   private static int k = 0;
   private static double[] v;
   private static double[] w;
   
   public static double dotProductRecursive()
   {
      return dotProductRecursive(v, w, k);
   }
   
   public static double dotProductRecursive(double[] v, double[] w, int k)
   {
      if(k == 1)
         return v[0] * w[0];
      else
      {
         return dotProductRecursive(v, w, k -1) + v[k-1] * w[k-1];
      }
   }
   
   //Q1.3
   private static double[][] outerProduct(double[] v, double[] w)
   {
      double[][] matrix = new double[v.length][w.length];
      
      for(int i = 0; i < v.length; i++)
      {
         for(int a = 0; i < w.length; a++)
         {
            matrix[i][a] = v[i] * w[a];
         }
      }
      
      return matrix;
   }
   
   //Q2.1
   public static double mean(double[] A)
   {
      double mean = 0;
      if(A.length == 0)
         throw new IllegalStateException("Array empty!");
      else 
      {
         double sum = 0;
         for(int i = 0; i < A.length; i++)
         {
            sum += A[i];
         }
         mean = sum/A.length;
         return mean;
      }
   }
   
   //Q2.2
   public static double median(double[] A)
   {
      for(int i = 0; i < A.length; i++)
      {
         int indexOfMin = indexOfMin(A, i);
         swop(i, indexOfMin, A);
      }
      
      if(A.length % 2 == 0)
         return(((A[A.length/2] + A[A.length/2 - 1])/2));
      else
      {
         int a = A.length/2;
         return A[a+1];
      }
   }
   
   private static void swop(int i, int j, double[] array) 
   {
      double temp;
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }
   
   private static int indexOfMin(double[] arr, int k)
   {
      double n = arr[k];
      for(int i = k; i < arr.length; i++)
      {
         if(n > arr[i])
            n = arr[i];
      }
      
      int a = 0;
      for(int i = k; i < arr.length; i++)
      {
         if(arr[i] == n)
            a = i;
      }
      
      return a;
   }
   
   //Q2.3
   private static double medianOfMedians(double[] A)
   {
      int arrays = A.length / 5;
      double[] medians = new double[arrays];
      
      int count = 0;
      for(int i = 0; i < medians.length; i++)
      {
         double[] sub = new double[5];
         for(int a = 0; a < sub.length; a++)
         {
            sub[a] = A[count];
            count++;
         }
         
         for(int a = 0; a < sub.length; a++)
         {
            int indexOfMin = indexOfMin(sub, a);
            swop(a, indexOfMin, sub);
         }
         
         double number = 0;
         int a = sub.length/2;
         number = sub[a+1];
         
         medians[i] = number;
      }
      
      for(int i = 0; i < medians.length; i++)
      {
         int indexOfMin = indexOfMin(medians, i);
         swop(i, indexOfMin, medians);
      }
      
      if(medians.length % 2 == 0)
         return(((medians[medians.length/2] + medians[medians.length/2 - 1])/2));
      else
      {
         int a = medians.length/2;
         return medians[a+1];
      }

   }
   
   public static void main(String[] args)
   {
      double[] vec = {1, 2, 3, 5};
      double[] vek = {5, 6, 8, 9};
      double[] big = {5, 5, 7, 7, 6, 8, 11, 5, 7, 2};
      System.out.println(dotProductIterative(vec, vek));
      System.out.println(dotProductRecursive(vec, vek, vec.length));
      
      //System.out.println(outerProduct(vec, vek));
      
      System.out.println(mean(vec));
      System.out.println(median(vek));
      
      System.out.println(medianOfMedians(big));
   }
}
