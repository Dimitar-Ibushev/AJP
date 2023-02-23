
public class Kiss
{
   public int numberOfKisses(int numberOfPeople)
   {
      int kisses;
      kisses = (numberOfPeople * (numberOfPeople-1)) / 2;
      return kisses;
   }
}
