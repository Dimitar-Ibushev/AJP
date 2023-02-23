package utility.collection;

public class Controller implements Runnable
{
   private AirportQueue port;
   private String type;
   
   public Controller(AirportQueue port, String type)
   {
      this.port = port;
      this.type = type;
   }

   @Override
   public void run()
   {
      while(true)
      {
         try
         {
            Thread.sleep(10000);
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
         
         if(type.equals("US"))
            port.getNextUSPassenger();
         else port.getNextNoNPassenger();
         
         try
         {
            Thread.sleep(5000);
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
   }
   
   
}
