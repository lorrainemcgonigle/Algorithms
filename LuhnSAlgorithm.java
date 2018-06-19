import java.util.*;
/*
 * Algorithm to check if a credit card number is valid or not
* Asks the user for the number that they want to check
 */

public class LuhnSAlgorithm {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();//takes in the number as a string
        String [] chars = number.split("");//splits the string into char array
        int []myNumbers = new int [chars.length];//create new int array
        for (int i = 0; i <chars.length; i++)
        {
            myNumbers[i] = Integer.parseInt(chars[i]);//puts the chars into the int array
        }
        check (myNumbers);//calls the check method on the array
        
    }
    public static void check (int []digits)
    {
        int sum = 0;
        int length = digits.length;
        for (int i = 0; i <length; i++)
        {
            int digit = digits [length - 1];//starts at the end of the array
            if (i % 2== 1)//Takes every second number
            {
                digit *= 2;//multiplies it by 2
            }
            /*Line below checks if the digit is greater than 9.
            *if it is we subtract 9 from it, if not it stays the same
            *this is added to the running total sum */
            sum += digit >9?digit-9:digit;//runnning total. 
        }
        if (sum % 10 == 0)//if the final total mod twn is zero
        {
            System.out.println("Valid");//this number is a valid number
        }
        else 
        {
            System.out.println("Invalid");//otherwise it is not valid
        }
    }
    
}
