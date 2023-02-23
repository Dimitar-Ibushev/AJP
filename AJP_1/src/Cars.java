
public class Cars
{
   public static void main(String[] args)
   {
      Garage garage = new Garage();
      
      Car car1 = new Car(garage, "VW");
      Car car2 = new Car(garage, "BMW");
      Car car3 = new Car(garage, "Audi");
      Car car4 = new Car(garage, "Subaru");
      Car car5 = new Car(garage, "Rover");
      Car car6 = new Car(garage, "Opel");
      Car car7 = new Car(garage, "Mercedes");
      Car car8 = new Car(garage, "Toyota");
      Car car9 = new Car(garage, "KIA");
      
      Thread park1 = new Thread(car1);
      Thread park2 = new Thread(car2);
      Thread park3 = new Thread(car3);
      Thread park4 = new Thread(car4);
      Thread park5 = new Thread(car5);
      Thread park6 = new Thread(car6);
      Thread park7 = new Thread(car7);
      Thread park8 = new Thread(car8);
      Thread park9 = new Thread(car9);
      
      park1.start();
      park2.start();
      park3.start();
      park4.start();
      park5.start();
      park6.start();
      park7.start();
      park8.start();
      park9.start();
   }
}
