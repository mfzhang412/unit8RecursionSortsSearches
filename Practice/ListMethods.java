import java.util.*;
import java.util.ArrayList;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>(n);
      System.out.println(tempList.size());
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
      }
      else        // All other size lists are created here
      {
          tempList.add(n - 1, (makeList((n-1)).get(n - 1)));
      }
      return tempList;
   }
   
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(6);
      if (tempList.size() == 0)
      
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
      }
   }
   
}