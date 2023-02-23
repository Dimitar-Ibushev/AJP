
public class WashTest
{
   public static void main(String[] args)
   {
      WashingHall hall = new WashingHall(5);
      
      Thread[] cars = new Thread[10];
      for(int i = 0; i < cars.length; i++)
      {
         CarToWash car = new CarToWash(hall);
         cars[i] = new Thread(car);
         cars[i].start();
      }
      
      Display disp = new Display(hall);
      Thread display = new Thread(disp);
      display.setDaemon(true);
      display.start();
      
   }
}
