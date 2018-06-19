
package stringsort;

import java.util.*;
public class StringSort {

   
    public static void main(String[] args) 
    {
        String s  = "Lorraine";
        String s2 = s.toLowerCase();
        char [] charArray = s2.toCharArray();
        String[]nameArray = {"John", "Paul", "George", "Ringo"};
       
        Stringsort(charArray);
        for (int x = 0; x <charArray.length;x++)
        {
            System.out.println(charArray[x]);
        }
        StringSortArray(nameArray);
        for (int x =0; x<nameArray.length; x++)
        {
            System.out.println(nameArray[x]);
        }
    }
    public static void Stringsort(char[]arr)
    {
         for (int x = 0; x < arr.length; x++)
        {
            for (int y = x+1; y < arr.length; y++)
            {
                if (arr[y] < arr[x])
                {
                    char temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
    public static void StringSortArray(String[]names)
    {
        for (int x = 0; x < names.length; x++)
        {
            for (int y = x+1; y < names.length; y++)
            {
                if (names[x].compareTo(names[y])>0)
                {
                    String temp = names[x];
                    names[x] = names[y];
                    names[y] = temp;
                }
            }
        }
    }
     
    
}
