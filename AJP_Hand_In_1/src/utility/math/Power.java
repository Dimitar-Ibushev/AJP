
package utility.math;

public class Power
{
   private long x;
   private int n;
   
   public long power()
   {
      return power(x, n-1);
   }
   
   //Question 1.1
   public static long power(long x, int n) throws IllegalArgumentException
   {
      if(n < 0) 
         throw new IllegalArgumentException("Negative power not accepted");
      if(n == 0)
         return 1;
      else return x * power(x, n-1);
   }
   
   //Question 1.2
   public static long power1(long x, int n) throws IllegalArgumentException
   {
      long temp = x; //holds the original value of x, so that it can be used as multiplication factor
      if(n < 0) 
         throw new IllegalArgumentException("Negative power not accepted");
      if(n == 0)
      {
         return 1;
      }
      else for(int i = n - 1; i > 0; i--)
      {
         x = x * temp;
      }
      return x;
   }
   
   //Question 1.3
   public long power2()
   {
      return power2(x, n-1);
   }
   
   public static long power2(long x, int n)
   {
      if(n < 0) 
         throw new IllegalArgumentException("Negative power not accepted");
      if(n == 0)
         return 1;
      else if(n%2 == 0)
         return (power2(x, n/2)) * (power2(x, n/2));
      else return x * power2(x, n-1);
   }
   

}

