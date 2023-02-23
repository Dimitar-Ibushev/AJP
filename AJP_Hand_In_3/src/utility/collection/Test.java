package utility.collection;

public class Test
{
   public static void main(String[] args)
   {
      AirportQueue port = new AirportQueue();
      Guide guide = new Guide(port);
      Thread g = new Thread(guide);
      g.start();
      
      Thread[] controller = new Thread[2];
      for(int i = 0; i < 2; i++)
      {
         String type = "";
         if(i % 2 == 0)
            type = "US";
         else type = "NON";
         Controller usc = new Controller(port, type);
         controller[i] = new Thread(usc);
         controller[i].start();
      }
      

   }
}
