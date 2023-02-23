
public class BurgerEmployee implements Runnable
{
   private String name;
   private BurgerBar bar;
   
   public BurgerEmployee(String name, BurgerBar bar)
   {
      this.name = name;
      this.bar = bar;
   }

   @Override
   public void run()
   {
      while(true)
      {
         bar.makeBurger(name);
      }
   }
   
 
}
