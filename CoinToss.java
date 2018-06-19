
package cointoss;
import java.util.*;
public class CoinToss 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int successful = 0;
        int unsuccessful = 0;
        int totalIterations = 1000;
        System.out.print("How many tosses?");
        int numTosses = sc.nextInt();
        System.out.print("How many consecutive matches?");
        int numConsec = sc.nextInt();
        for (int x = 0; x < totalIterations; x++)
        {
            
            int coin = 0;
            int lastToss = 0;
            int headConsec = 0;
            int tailConsec = 0;
            

            for (int i = 0; i < numTosses; i ++)  
            {
                coin = rand.nextInt(2);
                if ((coin < 1) && (coin == lastToss))
                {
                    headConsec ++;
                }
                else if ((coin > 1) && (coin == lastToss))
                {
                    tailConsec ++;
                }

            }
            if ((headConsec > numConsec) || (tailConsec > numConsec))
            {
                successful ++;
            }
            else 
            {
                unsuccessful ++;
            }
        
        }
        double probable = Math.abs((double)successful/totalIterations*100);
        int gcd = findGCD(totalIterations,successful);
        int numerator = Math.abs(successful/gcd);
        int denom = Math.abs(totalIterations/gcd);
        System.out.println(numerator + "/" + denom);
     
        
        System.out.println("There is a " + successful + " in " + totalIterations + " probability");
        System.out.println("The probability of a successful outcome is " + probable + "%");
    }
     public static int findGCD(int x, int y)
    {
        if ((x == 0) || (y == 0))
        {
            return x + y;
        }
        else 
        {
            int remainder = x%y;
            x = y;
            y = remainder;
            return findGCD(x, y);
        }
    }
}

