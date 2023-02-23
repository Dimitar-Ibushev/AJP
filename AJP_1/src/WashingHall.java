
public class WashingHall
{
   private QueueADT<Hall> available;
   private int places;
   
   public WashingHall(int numberOfWashingHalls)
   {
      available = (QueueADT<Hall>) new Object();
      for(int i = 0; i < numberOfWashingHalls; i++)
      {
         available.enqueue(new Hall(i + 1));
      }
      places = numberOfWashingHalls;
   }
   public synchronized void enterForWashing()
   {
      while(places == 0)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            //e.printStackTrace();
         }
      }
      
      places--;
      notifyAll();
      System.out.println("A car has entered washing hall " + places + 1);
   }
   
   public synchronized void leaveWashing()
   {
      places++;
      notifyAll();
   }
   
   public synchronized int getFreePlaces()
   {
      return places;
   }
   
}
