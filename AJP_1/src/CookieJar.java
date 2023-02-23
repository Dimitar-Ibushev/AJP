

public class CookieJar
{
   private int value;
   
   public CookieJar()
   {
      value = 0;
   }
   
   public synchronized void cook()
   {
      while(value > 4)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
      value += 16;
      notifyAll();
      System.out.println("Baker making cookies");
      
   }
   
   public synchronized void eat()
   {
      while(value <= 0)
      try
      {
         wait();
      }
      catch(InterruptedException e)
      {
         //
      }
      
      value--;
      notifyAll();
      Thread.yield();
      System.out.println("Client eating a cookie");
      System.out.println(value + " cookies left");
   }
   
   public synchronized int getBurgerCount()
   {
      return value;
   }
}
