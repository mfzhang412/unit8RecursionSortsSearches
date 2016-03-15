import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        if (n <= 0) // The smallest list we can make
        {
            return new ArrayList<Integer>();
        }
        else // All other size lists are created here
        {
            tempList = makeList(n - 1);  //solve the smaller problem
            tempList.add(n);             // use it to solve the larger problem
            return tempList;
        }

        return tempList;
    }
    
    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 1) || (list.size() == 0))
        {
            return list;
        }
        else
        {
            Integer tempInt = list.remove(0);
            list = ListMethods.reverseList(list);
            list.add(tempInt);
        }
        
        return list;
    }
    
    public static ArrayList<Integer> even(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 0) || (list.size() == 1))
        {
            return list;
        }
        else
        {
            Integer tempInt = list.remove(0);
            list.remove(0);  //Throw away the second element
            list = listMethods.even(list);
            list.add(0, tempInt);
        }
        
        return list;
    }
    
    public static ArrayList<Integer> merge(ArrayList<Integer> tList, ArrayList<Integer> tList2)
    {
        ArrayList<Integer> list1 = ListMethods.deepClone(tList1);
        ArrayList<Integer> list2 = ListMethods.deepClone(tList1);
        ArrayList<Integer> tempList;  //The list we will return
        if (list1.size() == 0)
        {
            return list2;
        }
        else if (list2.size() == 0)
        {
            return list1;
        }
        else
        {
            Integer lastElement1 = list1.get(list1.size() - 1);
            integer lastElement2 = list2.get(list2.size() - 1);
            if (lastElement1.compareTo(lastElement2) < 0)
            {
                //Remove the largest element in list2
                lastElement2 = list2.remove(list2.size() - 1);
                // Now merge the lists recursively
                tempList = ListMethods.merge(list1, list2);
                //Add back the largest element
                tempList.add(lastElement2);
            }
            else
            {
                //Remove the largest element in list1
                lastElement1 = list1.remove(list1.size() - 1);
                //Now merge the lists recursively
                tempList = ListMethods.merge(list1, list2);
                //Add back the largest element
                tempList.add(lastElement1);
            }
        }
        
        return templist;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> tempList = ListMethods.makeList(100);
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