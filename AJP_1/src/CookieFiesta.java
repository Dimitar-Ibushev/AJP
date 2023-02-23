
public class CookieFiesta
{
   public static void main(String[] args)
   {
      CookieJar jar = new CookieJar();
      
      CookieBaker baker = new CookieBaker(jar);
      CookieEater eater1 = new CookieEater(jar);
      CookieEater eater2 = new CookieEater(jar);
      CookieEater eater3 = new CookieEater(jar);
      CookieEater eater4 = new CookieEater(jar);
      CookieEater eater5 = new CookieEater(jar);
      CookieEater eater6 = new CookieEater(jar);
      CookieEater eater7 = new CookieEater(jar);
      CookieEater eater8 = new CookieEater(jar);
      CookieEater eater9 = new CookieEater(jar);
      CookieEater eater10 = new CookieEater(jar);
      CookieEater eater11 = new CookieEater(jar);
      CookieEater eater12 = new CookieEater(jar);
      CookieEater eater13 = new CookieEater(jar);
      CookieEater eater14 = new CookieEater(jar);
      CookieEater eater15 = new CookieEater(jar);
      CookieEater eater16 = new CookieEater(jar);
      CookieEater eater17 = new CookieEater(jar);
      CookieEater eater18 = new CookieEater(jar);
      CookieEater eater19 = new CookieEater(jar);
      CookieEater eater20 = new CookieEater(jar);
      
      Thread baking = new Thread(baker);
      Thread eating1 = new Thread(eater1);
      Thread eating2 = new Thread(eater2);
      Thread eating3 = new Thread(eater3);
      Thread eating4 = new Thread(eater4);
      Thread eating5 = new Thread(eater5);
      Thread eating6 = new Thread(eater6);
      Thread eating7 = new Thread(eater7);
      Thread eating8 = new Thread(eater8);
      Thread eating9 = new Thread(eater9);
      Thread eating10 = new Thread(eater10);
      Thread eating11 = new Thread(eater11);
      Thread eating12 = new Thread(eater12);
      Thread eating13 = new Thread(eater13);
      Thread eating14 = new Thread(eater14);
      Thread eating15 = new Thread(eater15);
      Thread eating16 = new Thread(eater16);
      Thread eating17 = new Thread(eater17);
      Thread eating18 = new Thread(eater18);
      Thread eating19 = new Thread(eater19);
      Thread eating20 = new Thread(eater20);
      
      baking.setDaemon(true);
      
      baking.start();
      eating1.start();
      eating2.start();
      eating3.start();
      eating4.start();
      eating5.start();
      eating6.start();
      eating7.start();
      eating8.start();
      eating9.start();
      eating10.start();
      eating11.start();
      eating12.start();
      eating13.start();
      eating14.start();
      eating15.start();
      eating16.start();
      eating17.start();
      eating18.start();
      eating19.start();
      eating20.start();

      try
      {
         eating1.join();
         eating2.join();
         eating3.join();
         eating4.join();
         eating5.join();
         eating6.join();
         eating7.join();
         eating8.join();
         eating9.join();
         eating10.join();
         eating11.join();
         eating12.join();
         eating13.join();
         eating14.join();
         eating15.join();
         eating16.join();
         eating17.join();
         eating18.join();
         eating19.join();
         eating20.join();
      }
      catch(InterruptedException e)
      {
         //
      }
      
      
   }
}
