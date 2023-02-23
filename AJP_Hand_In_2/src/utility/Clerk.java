package utility;

public class Clerk implements Runnable
{
   private NumberDispenser dispenser;
   private String name;
   
   public Clerk(NumberDispenser dispenser, String name)
   {
      this.dispenser = dispenser;
      this.name = name;
   }

   @Override
   public void run()
   {
      while(true)
      {
         dispenser.nextCustomer(name);
         try
         {
            Thread.sleep(100);
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
   }
   
   
}
