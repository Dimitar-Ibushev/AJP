
public class CarToWash implements Runnable
{
   private WashingHall hall;
   
   public CarToWash(WashingHall hall)
   {
      this.hall = hall;
   }

   private void washing(int min, int max)
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
      hall.enterForWashing();
      
      washing(2000, 10000);
      
      hall.leaveWashing();
   }
   
   
}
