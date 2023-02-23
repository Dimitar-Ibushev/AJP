
public class Reader implements Runnable
{
   private ReadWriteSafe lock;
   
   public Reader(ReadWriteSafe lock)
   {
      this.lock = lock;
   }
   
   private void reading(int min, int max)
   {
      long time = (long)(Math.random() * (max - min) + min);
      try
      {
         Thread.sleep(time);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }

   @Override
   public void run()
   {
      while(true)
      {
         reading(1000, 2000);
         lock.acquireRead();
         reading(500, 100);
         lock.releaseRead();
         reading(5000, 10000);
      }
   }
   
   
}
