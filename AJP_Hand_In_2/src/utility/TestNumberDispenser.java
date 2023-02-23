package utility;

public class TestNumberDispenser
{
   public static void main(String[] args)
   {
      NumberDispenser dispenser = new NumberDispenser();
      
      Clerk clerk1 = new Clerk(dispenser, "First clerk");
      Clerk clerk2 = new Clerk(dispenser, "Second clerk");
      
      Customer custom1 = new Customer(dispenser);
      Customer custom2 = new Customer(dispenser);
      Customer custom3 = new Customer(dispenser);
      Customer custom4 = new Customer(dispenser);
      Customer custom5 = new Customer(dispenser);
      Customer custom6 = new Customer(dispenser);
      Customer custom7 = new Customer(dispenser);
      Customer custom8 = new Customer(dispenser);
      Customer custom9 = new Customer(dispenser);
      Customer custom10 = new Customer(dispenser);

      Thread server1 = new Thread(clerk1);
      Thread server2 = new Thread(clerk2);
      
      Thread taker1 = new Thread(custom1);
      Thread taker2 = new Thread(custom2);
      Thread taker3 = new Thread(custom3);
      Thread taker4 = new Thread(custom4);
      Thread taker5 = new Thread(custom5);
      Thread taker6 = new Thread(custom6);
      Thread taker7 = new Thread(custom7);
      Thread taker8 = new Thread(custom8);
      Thread taker9 = new Thread(custom9);
      Thread taker10 = new Thread(custom10);
      
      server1.start();
      server2.start();
      
      taker1.start();
      taker2.start();
      taker3.start();
      taker4.start();
      taker5.start();
      taker6.start();
      taker7.start();
      taker8.start();
      taker9.start();
      taker10.start();

   }
}
