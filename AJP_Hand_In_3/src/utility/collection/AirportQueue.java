package utility.collection;

import java.util.ArrayList;

public class AirportQueue implements PassengerQueue
{
   private ArrayList<Passenger> USPassengers;
   private ArrayList<Passenger> NonUSPassengers;

   public AirportQueue()
   {
      USPassengers = new ArrayList<Passenger>();
      NonUSPassengers = new ArrayList<Passenger>();
   }
   @Override
   public synchronized void putPassengerInQueue(Passenger p)
   {
      while(NonUSPassengers.size() > 1 || USPassengers.size() > 1)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
           // e.printStackTrace();
         }
      }
      if(p.getNationality() == "US")
      {
         USPassengers.add(p);
         System.out.println("Passenger " + p.getNationality() + " " + p.getPassportNumber() + " has appeared");
         notifyAll();
      }
      else
      {
         NonUSPassengers.add(p);
         System.out.println("Passenger " +p.getNationality() + " " + p.getPassportNumber() + " has appeared");
         notifyAll();
      }
   }

   @Override
   public synchronized Passenger getNextUSPassenger()
   {
     while(USPassengers.size() == 0 || NonUSPassengers.size() > 1)
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
      Passenger pass = new Passenger("empty", 0);
      pass = USPassengers.get(0);
      System.out.println("Passenger " + pass.getNationality() + " " + pass.getPassportNumber() + " has been checked.");
      USPassengers.remove(0);
      notifyAll();
      return pass;
   }

   @Override
   public synchronized Passenger getNextNoNPassenger()
   {
      while(NonUSPassengers.size() == 0 || USPassengers.size() > 1)
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
       Passenger pass = new Passenger("empty", 0);
       pass = NonUSPassengers.get(0);
       System.out.println("Passenger " + pass.getNationality() + " " + pass.getPassportNumber() + " has been checked.");
       NonUSPassengers.remove(0);
       notifyAll();
       return pass;
    }
   

   

}
