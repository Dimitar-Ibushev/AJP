package utility.collection;

public interface PassengerQueue
{
   void putPassengerInQueue(Passenger p);
   Passenger getNextUSPassenger();
   Passenger getNextNoNPassenger();
}
