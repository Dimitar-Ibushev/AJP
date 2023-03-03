package branch;

import java.util.ArrayList;


public class Heap
{
   private ArrayList<String> array;
   private int current;
   
   public Heap()
   {
      array = new ArrayList<String>();
      current = 0;
   }
   
   public void addElement(int add)
   {
      int temp = current;
      String swap = add + "";
      String hold = "";
      array.add(add + "");
      current++;
      
      while(temp > 0)
      {
         if(Integer.parseInt(swap) < Integer.parseInt(array.get((temp - 1)/2)))
         {
            hold = array.get((int) (Math.ceil(temp - 1)/2));
            array.set((int) (Math.ceil(temp - 1)/2), swap);
            array.set(temp, hold);
            swap = hold;
            temp--;
         }
         else temp--;
      }
   }
   
   public void removeLast()
   {
      if(array.size() > 0)
      {
         array.remove(current);
         current--;
      }
   }
   
   public void removeMin()
   {
      int temp = current;
      String swap = array.get(current);
      String hold = "";
      
      if(array.size() > 0)
      {
         array.set(0, array.get(current));
         array.remove(current);
         current--;
         
         while(temp > 0)
         {
            if(Integer.parseInt(swap) < Integer.parseInt(array.get((temp - 1)/2)))
            {
               hold = array.get((int) (Math.ceil(temp - 1)/2));
               array.set((int) (Math.ceil(temp - 1)/2), swap);
               array.set(temp, hold);
               swap = hold;
               temp--;
            }
            else temp--;
         }
      }
   }
   
   public String toString()
   {
      return array.toString();
   }
}
