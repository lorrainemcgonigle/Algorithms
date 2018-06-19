
package sievealgorithm;
import java.util.*;
/**
 *This is an algorithm for finding and working with
 * prime numbers
 * @author lorra
 */
public class SieveAlgorithm 
{
    
    public static void main(String[] args) 
    {
        int size = 100;
        boolean [] primeNumbers = new boolean [size];
        for (int i = 2; i < size; i++)
        {
            primeNumbers[i] = true;
        }
        for (int i = 2; i < size; i++)
        {
            if (primeNumbers[i] == true)
            {
               for (int j = i+i; j <size; j+=i)
               {
                   primeNumbers[j] = false;
               }
            }
        }
        for (int x = 2; x < size; x++)
        {
            
            if (primeNumbers[x] == true)
            {
                System.out.println(x);
            }
          
        }
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check");
        int checkNum = sc.nextInt();
        
        checkPrime(checkNum, primeNumbers);
        closestPrimeNum(checkNum, primeNumbers);
        int distance = distanceBetween(checkNum, primeNumbers);
        System.out.println("Distance betweent the closest two prime numbers is " + distance);
        
        
    }
    public static void checkPrime(int n, boolean[]boolArray)
    {
        for (int x = 0; x < boolArray.length; x++)
        {
            if (boolArray[n] == true) 
            {
                System.out.println(n + " is prime.");
                return;
            }
            else
            {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
    }
    
    public static int distanceBetween(int n, boolean[]boolArray)
    {
        int pre = 0;
        int post = 0;
        
        for (int x = n; x >=0; x--)
        {
            if (boolArray[x] == true)
            {
                pre = x;
                break;
            }
        }
        for (int i = n+1; i <boolArray.length; i++)
        {
            if (boolArray[i] == true)
            {
                post = i;
                break;
            }
        }
        int result = Math.abs(post - pre);
        return result;
    }
    
    public static void closestPrimeNum (int n, boolean[]boolArray)
    {
        int lowerClosest = 0;
        int higherClosest = 0;
        for (int x  = 2; x < boolArray.length; x++)
        {
            if (boolArray[x] == true)
            {
                if (x < n)
                {
                    lowerClosest = x;
                    
                }
            }
        }
        for (int y = 2; y < boolArray.length; y++)
        {
            if (boolArray[y] == true)
            {
                if (y >n)
                {
                    higherClosest = y;
                    break;               
                }
            }
        }
        int result1 = n - lowerClosest;
        int result2 = higherClosest - n;
        int closestPrime = 0;
        if (result1 == result2)
        {
            System.out.println(n + " is an equal distance from " + lowerClosest + " and " + higherClosest);
            
        }
        else
        {
            if (result1 < result2)
           {
               closestPrime = lowerClosest;
           }
           else
           {
               closestPrime = higherClosest;
           }
            System.out.println("The closest prime number to " + n + " is " + closestPrime);

        }
       
    }
    
    
}
