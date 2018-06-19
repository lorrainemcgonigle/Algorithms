/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmultiple;
import java.util.*;
 
public class SortMultiple
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();//get the array size
        String[] names = new String[numofstudents];//will hold the student names
        int[] array = new int[numofstudents];//will hold the scores
        for(int i = 0; i < numofstudents; i++) //takes in the details for each student
        {
            System.out.print("Enter the student's name: ");
            names[i] = input.next();
            System.out.print("Enter the student's score: ");
            array[i] = input.nextInt();
        }
        selectionSort(names, array);//calls the array sort
        for (int x = 0; x < names.length; x++)
        {
            System.out.println(names[x]);//prints
        }
    }
    public static void selectionSort(String[] names, int[] array) 
    {
        for(int i = array.length - 1; i >= 1; i--) //loops from end of the array 
        {
            String temp;//temp variable
            int currentMax = array[0];//current max score set to the first element in the score array
            int currentMaxIndex = 0;//index of the max score set to zero
            for(int j = 1; j <= i; j++) //loops from one to the length of i
            {
                if (currentMax > array[j]) //if current max at index zero is greater than the first element
                {
                    currentMax = array[j];//change current max value as the value of array[j] 
                    currentMaxIndex = j;//set the index to j
                }
            }       
                if (currentMaxIndex != i) //if the current max index isn't the same as i
                {
                    temp = names[currentMaxIndex];//set the value of temp as the value in the element at max value
                    names[currentMaxIndex] = names[i];//swap the names around
                    names[i] = temp;
                    array[currentMaxIndex] = array[i];//swap the scores to correspond with their names
                    array[i] = currentMax;
                }
        }       
    }
}
