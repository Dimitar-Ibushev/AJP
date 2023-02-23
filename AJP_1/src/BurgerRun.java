
public class BurgerRun
{
   public static void main(String[] args)
   {
      BurgerBar bar = new BurgerBar(10);
      
      BurgerEmployee emp1 = new BurgerEmployee("EMP1", bar);
      BurgerEmployee emp2 = new BurgerEmployee("EMP2", bar);
      
      BurgerCustomer custom1 = new BurgerCustomer("CUSTOM1", bar, 2);
      BurgerCustomer custom2 = new BurgerCustomer("CUSTOM2", bar, 3);
      BurgerCustomer custom3 = new BurgerCustomer("CUSTOM3", bar, 1);
      BurgerCustomer custom4 = new BurgerCustomer("CUSTOM4", bar, 1);
      BurgerCustomer custom5 = new BurgerCustomer("CUSTOM5", bar, 3);
      BurgerCustomer custom6 = new BurgerCustomer("CUSTOM6", bar, 2);
      BurgerCustomer custom7 = new BurgerCustomer("CUSTOM7", bar, 2);
      
      Thread maker1 = new Thread(emp1);
      Thread maker2 = new Thread(emp2);
      
      Thread consumer1 = new Thread(custom1);
      Thread consumer2 = new Thread(custom2);
      Thread consumer3 = new Thread(custom3);
      Thread consumer4 = new Thread(custom4);
      Thread consumer5 = new Thread(custom5);
      Thread consumer6 = new Thread(custom6);
      Thread consumer7 = new Thread(custom7);
      
      maker1.start();
      maker2.start();
      
      consumer1.start();
      consumer2.start();
      consumer3.start();
      consumer4.start();
      consumer5.start();
      consumer6.start();
      consumer7.start();
   }
}
