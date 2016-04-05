import java.util.Random;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the maximum length of each element of the array
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static String[] randomStringArray(int length, int n)
   {  
      String[] a = new String[length];
      int ran = (int) Math.random() * n;
      for (int i = 0; i < a.length; i++)
      {
         a[i] = ArrayUtil.randomString(ran);
      }
      
      return a;
   }

   private static String randomString(int length)
   {
       String str = "";
       for (int i = 0; i < length; i++)
       {
           int random = (int) Math.random() * 26;
           str += 'a' + random;
       }
       
       return str;
   }
   
   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      
