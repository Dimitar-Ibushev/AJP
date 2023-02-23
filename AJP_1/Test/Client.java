
public class Client implements Runnable
{
   private Channel ch;
   private String message;
   
   public Client(Channel ch, String message)
   {
      this.ch = ch;
      this.message = message;
   }
   
   public void run()
   {
      while(true)
      {
      ch.call(message);
      }
   }
}
