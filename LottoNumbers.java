/*
 * @author Lorraine
 * 
 * 
 */
package lottonumbers;
import java.util.*;
public class LottoNumbers {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
        int numberRange = 0;
        int success = 0;
        int failure = 0;
        boolean isSuccessful = true;
        int []lottoArray = new int [6];
        System.out.print("What number do you want as your upper limit?");
        numberRange = sc.nextInt();
        for (int a = 1; a <=1000; a++)
        {
            
            for (int x = 0; x <6 ; x++)
            {
                int number = rand.nextInt((42)+1);          
                lottoArray[x] = number;
            }
            for (int x = 0; x <6; x ++)
            {
                if (lottoArray[x] <= numberRange)
                {
                    isSuccessful = true;
                }
                else
                    isSuccessful = false;
            }
            if (isSuccessful)
            {
                success ++;
            }
            else
            {
                failure ++;
            }
        
        }
        System.out.println("Successful attempts " + success);
        System.out.println("Failed attempts " + failure);
        double probable = Math.abs((double)success/1000*100);
        System.out.println("Probability of success is " + probable + "%");
        
    }
}
