
public class BurgerBar
{
   private int numberOfBurgers;
   private int maxNumberOfBurgers;
   
   public BurgerBar(int max)
   {
      numberOfBurgers = 0;
      maxNumberOfBurgers = max;
   }
   
   public synchronized void makeBurger(String name)
   {
      while(numberOfBurgers < maxNumberOfBurgers)
      {
      numberOfBurgers++;
      try
      {
         wait(2000);
      }
      catch (InterruptedException e)
      {
        // e.printStackTrace();
      }
      notifyAll();
      }
   }
   
   public synchronized void eatBurger(String name)
   {
      while(!(numberOfBurgers >= 0))
      {
         numberOfBurgers--;
      }
      try
      {
         wait();
      }
      catch (InterruptedException e)
      {
         //printStackTrace();
      }
      notifyAll();
   }
   
   public synchronized int getNumber()
   {
      return numberOfBurgers;
   }
}
