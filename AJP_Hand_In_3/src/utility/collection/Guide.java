package utility.collection;

import java.util.Random;

public class Guide implements Runnable
{
   private AirportQueue port;
   
   public Guide(AirportQueue port)
   {
      this.port = port;
   }

   @Override
   public void run()
   {
      while(true)
      {
         try
         {
            Thread.sleep(2000);
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
         
         port.putPassengerInQueue(appear());
         
         try
         {
            Thread.sleep(2000);
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
   }
   
   private Passenger appear()
   {
      Random random = new Random();
      String nationality = "";
      if(random.nextBoolean())
      {
         nationality = "US";
      }
      else nationality = "NON";
      int passport = random.nextInt(899999) + 100000;
      Passenger pass = new Passenger(nationality, passport);
      return pass;
   }
   
   
}
