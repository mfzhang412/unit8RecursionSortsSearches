// Write a program that asks the user for a file name and prints the number of characters,
// words, and lines in that file.
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class WordChoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordChoice
{
    public WordChoice(String fileName)
    {
        int counter = 0;

        File read = new File(fileName);

        try
        {
            Scanner in = new Scanner(read);
            in.useDelimiter("");
            while(in.hasNext())
            {
                counter += 1;
            }
            System.out.println("Number of characters: " + counter);
            counter = 0;

            while(in.hasNext())
            {
                counter += 1;
            }
            System.out.println("Number of words: " + counter);
            counter = 0;

            while(in.hasNext())
            {
                counter += 1;
            }
            System.out.println("Number of lines: " + counter);
        }
        catch (IOException exception)
        {
            System.out.println("file not found");
        }


    }

    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a file name: ");
        String name = s.next();
        WordChoice file = new WordChoice(name);
    }

}