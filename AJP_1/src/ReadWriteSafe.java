
public class ReadWriteSafe implements ReadWrite
{
   private int readers;
   private int writers;
   
   public ReadWriteSafe()
   {
      readers = 0;
      writers = 0;
   }

   @Override
   public void acquireRead()
   {
      while(writers > 0)
      {
         try
         {
            wait();
         }
         catch(InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
      readers++;
   }

   @Override
   public void releaseRead()
   {
      readers--;
      if(readers==0)
      {
         notify();
      }
   }

   @Override
   public void acquireWrite()
   {
      while(readers > 0 || writers > 0)
      {
         try
         {
            wait();
         }
         catch(InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
      writers++;
   }

   @Override
   public void releaseWrite()
   {
      writers--;
      notifyAll();
   }

}
