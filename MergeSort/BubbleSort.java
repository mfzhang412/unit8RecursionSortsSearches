/*
Java Bubble Sort Example
This Java bubble sort example shows how to sort an array of int using bubble
sort algorithm. Bubble sort is the simplest sorting algorithm.
 */

public class BubbleSort
{
    private static int[] bubbleSort(int[] intArray)
    {
        int i = 0;
        
        while (i < intArray.length - 1)
        {
            for (int j = 0; j < intArray.length - 1; j++)
            {
                if (intArray[j] > intArray[j + 1])
                {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
            i++;
        }
        
        return intArray;
    }
    
    public static void main(String[] args)
    {   
        int[] intArray = new int[25];
        for (int i = 0; i < 25; i++)
        {
            int elem = (int) (Math.random() * 101);
            intArray[i] = elem;
        }
        
        System.out.println("Array before bubble sort");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        
        intArray = BubbleSort.bubbleSort(intArray);
        
        System.out.println("/nArray after bubble sort");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
}