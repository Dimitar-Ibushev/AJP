package utility;

public class NumberDispenser implements TakeANumber
{
   private int nextTake = 0;
   private int nextServe = 1;
   
   @Override
   public synchronized void takeNextNumber()
   {
      nextTake++;
      notifyAll();
      Thread.yield();
      System.out.println("Customer number " + nextTake + " has arrived");
            
   }

   @Override
   public synchronized int nextCustomer(String clerk)
   {
      while(true)
      {
         while(!(nextTake > 0 && nextServe <= nextTake))
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
      
      while(true)
      {
         int current = nextServe;
         
         if(nextServe != nextTake)
            System.out.println(clerk + " has served customer number " + nextServe + "\nNext customer: " + (current + 1));
         else System.out.println(clerk + " has served customer number " + nextServe + "\nNo more customers");
         nextServe++;
         notifyAll();
         return nextServe;
      }
      
     }
      
   }

}
