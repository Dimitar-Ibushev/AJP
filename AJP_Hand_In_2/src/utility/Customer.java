package utility;

public class Customer implements Runnable
{
   private NumberDispenser dispenser;
   
   public Customer(NumberDispenser dispenser)
   {
      this.dispenser = dispenser;
   }

   @Override
   public void run()
   {
      dispenser.takeNextNumber();
   }
   
}
