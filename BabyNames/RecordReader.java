import java.util.Scanner;

//print names that comprise the top 50% of boy names and girl names.

/**
   This class processes baby name records.
*/
public class RecordReader
{
   private double total;
   private double limit;
   private int bPopulation;
   private int gPopulation;
   
   /**
      Constructs a RecordReader with a zero total.
   */
   public RecordReader(double aLimit, int bPop, int gPop)
   {
      total = 0;
      limit = aLimit;
      population = pop;
   }

   /**
      Reads an input record and prints the name if the current total is less 
      than the limit.
      @param in the input stream
   */
   public void process(Scanner in)
   {
      this.totNames(in);
      String name = in.next();
      percentTot += in.nextInt();
      double percent = in.nextDouble();
      
      if (total < limit) { System.out.print(name + " "); }
      total = total + percent;
   }

   /**
      Checks whether there are more inputs to process
      @return true if the limit has not yet been reached
   */
   public boolean hasMore()
   {
      return total < limit;
   }
}
