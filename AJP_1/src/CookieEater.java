
public class CookieEater implements Runnable
{
   private CookieJar counter;
   
   public CookieEater(CookieJar counter)
   {
      this.counter = counter;
   }

   @Override
   public void run()
   {
      while(true)
      {
      counter.eat();
      /*try
      {
         Thread.sleep(5000);
      }
      catch(InterruptedException e)
      {
         //
      }
      */
      }
   }
}
