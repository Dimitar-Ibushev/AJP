


public class Text
{
   private String text;
   
   public Text(String text)
   {
      this.text = text;
   }
   
   public String getText()
   {
      return text;
   }
   
   public String toString()
   {
      return text;
   }
   
   public boolean isPalindrome()
   {
      return isPalindrome(text, 0, text.length() - 1);
   }
   
   private static boolean isPalindrome(String text, int left, int right)
   {
   if (left >= right)
   {
   return true;
   }
   while(!(Character.isAlphabetic(text.charAt(left))))
   {
      left++;
   }
   while(!(Character.isAlphabetic(text.charAt(right))))
   {
      right--;
   }
   return (Character.toLowerCase(text.charAt(left))
   == Character.toLowerCase(text.charAt(right)))
   && isPalindrome(text, left + 1, right - 1);
   }
   
   public String reverseString()
   {
      return reverseString(text, text.length() - 1);
   }
   
   private static String reverseString(String text, int length)
   {
     if(length >= 0)
     {
        return text.charAt(length) + reverseString(text, length - 1);
     }
     return "";
     
   }
   
}
