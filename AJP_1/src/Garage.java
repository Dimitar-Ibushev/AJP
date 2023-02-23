
public class Garage implements ParkingPlace
{
   private int freePlaces = 4;
   
   @Override
   public synchronized void arrive(String car)
   {
      while(!(freePlaces > 0))
      {
         try
         {
            System.out.println("Car " + car + " couldn't  find free place and is driving around");
            wait();
         }
         catch(InterruptedException e)
         {
            //
         }
      }
      freePlaces--;
      notifyAll();
      System.out.println("Car " + car + " has parked. Remaining places: " + freePlaces);
   }

   @Override
   public synchronized void leave(String car)
   {
      while(freePlaces == 4)
      {
         try
         {
            wait();
         }
         catch(InterruptedException e)
         {
            //
         }
      }
      freePlaces++;
      notifyAll();
      System.out.println("Car " + car + " has left. Remaining places: " + freePlaces);
   }

   @Override
   public int freePlaces()
   {
      return freePlaces;
   }

}
