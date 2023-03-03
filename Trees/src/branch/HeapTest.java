package branch;

public class HeapTest
{
   public static void main(String[] args)
   {
      Heap heap = new Heap();
      
      heap.addElement(1);
      heap.addElement(12);
      heap.addElement(17);
      heap.addElement(87);
      heap.addElement(34);
      heap.addElement(3);
      heap.addElement(45);
      heap.addElement(32);
      
      System.out.println(heap);
   }
   

}
