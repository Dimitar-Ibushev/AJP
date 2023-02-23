

public class Channel implements IChannel
{
   private String contain = "";
   private int calls = 0;
   
   public synchronized String call(String message)
   {

      while(!(contain.equals("")))
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
      
      contain = message;
      notifyAll();
      return message;
      
   }

   @Override
   public synchronized String accept()
   {
         while(!(calls == 0))
            try
            {
               wait();
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }
         
         calls++;
         System.out.println("A call has been received!");
         notifyAll();
      return null; //unsure as to why we need this string return
   }

   @Override
   public synchronized void reply(String answer)
   {

         while(calls == 0)
            try
            {
               wait();
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }
         
         calls--;
         System.out.println("Answer is " + answer + ". Call ended");
         contain = "";
         notifyAll();
      
      
   }
}
