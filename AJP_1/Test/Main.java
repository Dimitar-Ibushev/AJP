
public class Main
{
   public static void main(String[] args)
   {
      Channel channel = new Channel();
      Server serve = new Server(channel, "Maybe");
      Client first = new Client(channel, "Q1");
      Client second = new Client(channel, "Q2");
      Client third = new Client(channel, "Q3");
      Client fourth = new Client(channel, "Q4");
      Client fifth = new Client(channel, "Q5");
      Client sixth = new Client(channel, "Q6");
      Client seventh = new Client(channel, "Q7");
      Client eigtht = new Client(channel, "Q8");
      Client ninth = new Client(channel, "Q9");
      Client tenth = new Client(channel, "Q10");
      
      Thread server = new Thread(serve);
      server.start();
      
      Thread one = new Thread(first);
      Thread two = new Thread(second);
      Thread three = new Thread(third);
      Thread four = new Thread(fourth);
      Thread five = new Thread(fifth);
      Thread six = new Thread(sixth);
      Thread seven = new Thread(seventh);
      Thread eigth = new Thread(eigtht);
      Thread nine = new Thread(ninth);
      Thread ten = new Thread(tenth);
      
      one.start();
      two.start();
      three.start();
      four.start();
      five.start();
      six.start();
      seven.start();
      eigth.start();
      nine.start();
      ten.start();
      
      
   }
}
