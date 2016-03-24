import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = 50;

   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner s = new Scanner(System.in);
      System.out.print("Enter in the text file's name: ");
      String text = s.next();
      System.out.println("");
      System.out.print("Enter in the population of males: ");
      String b
      
      Scanner in = new Scanner(new File(text));
      
      RecordReader boys = new RecordReader(LIMIT, b, g);
      RecordReader girls = new RecordReader(LIMIT, b, g);
      
      while (boys.hasMore() || girls.hasMore())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
   }
}