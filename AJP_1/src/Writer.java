
public class Writer implements Runnable
{
   private ReadWriteSafe lock;
   
   public Writer(ReadWriteSafe lock)
   {
      this.lock = lock;
   }
   
   private void writing(int min, int max)
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
         writing(1000, 2000);
         lock.acquireWrite();
         writing(500, 100);
         lock.releaseWrite();
         writing(5000, 10000);
      }
   }
   
   
}