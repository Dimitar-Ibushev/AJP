
public class Server implements Runnable
{
   private Channel ch;
   private String answer;
   
   public Server(Channel ch, String answer)
   {
      this.ch = ch;
      this.answer = answer;
   }
   
   public void run()
   {
      while(true)
      {
      ch.accept();
      
      try
      {
         Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
      
      ch.reply(answer);
      }
   }
}
