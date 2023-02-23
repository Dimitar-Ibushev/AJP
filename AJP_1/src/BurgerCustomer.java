
public class BurgerCustomer implements Runnable
{
   private int burgersToEat;
   private String name;
   private BurgerBar bar;
   
   public BurgerCustomer(String name, BurgerBar bar, int burgersToEat)
   {
      this.name = name;
      this.bar = bar;
      this.burgersToEat = burgersToEat;
   }

   @Override
   public void run()
   {
      for(int i = bar.getNumber(); i >= 0; i--) 
      {
         bar.eatBurger(name);
         System.out.println("Burger eaten by: " + name + "Burgers Left: " + bar.getNumber());
      }
      
   }
}
