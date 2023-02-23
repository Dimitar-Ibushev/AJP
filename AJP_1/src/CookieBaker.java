

public class CookieBaker implements Runnable
{
   private CookieJar counter;
   
   public CookieBaker(CookieJar counter)
   {
      this.counter = counter;
   }

   @Override
   public void run()
   {
      while(true)
      {
      counter.cook();
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
         //e.printStackTrace();
      }
      }
      
   }
   
   
}
