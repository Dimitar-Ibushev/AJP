
public class Car implements Runnable
{
   private Garage garage;
   private String car;
   
   public Car(Garage garage, String car)
   {
      this.garage = garage;
      this.car = car;
   }

   @Override
   public void run()
   {
      System.out.println("Car " + car + " is entering the parking lot");
      
      try
      {
         Thread.sleep(1000);
      }
      catch(InterruptedException e)
      {
         //
      }
      
      garage.arrive(car);
      
      try
      {
         Thread.sleep(Math.round(Math.random() * 10000));
      }
      catch(InterruptedException e)
      {
         //
      }
      
      System.out.println("Car " + car + " is prepearing to leave");
      
      try
      {
         Thread.sleep(1000);
      }
      catch(InterruptedException e)
      {
         //
      }
      
      garage.leave(car);
      
   }
   
}
