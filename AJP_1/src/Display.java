
public class Display implements Runnable
{
   private WashingHall hall;

   public Display(WashingHall hall)
   {
      this.hall = hall;
   }
   @Override
   public void run()
   {
      while(true)
      {
      System.out.println("Free places: " + hall.getFreePlaces());
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
