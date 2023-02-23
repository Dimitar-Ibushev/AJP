
public class MyMath
{
   private int n;
   
   public int sum()
   {
      return sum(n - 1);
   }
   
   public static int sum(int n)    
   {                               
      if(n == 0)
      {
         return 0;
      }
      return n + sum(n - 1);
   }
}
