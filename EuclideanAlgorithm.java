
package euclideanalgorithm;
import java.util.*;
/**
 *This program uses a method to find the greatest common divider of two
 * numbers
 * @author lorra
 */
public class EuclideanAlgorithm {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//Takes in first number
        int num2 = sc.nextInt();//Takes in second number
        int greatest = findGCD (num1, num2);//calls method 
        System.out.println("Greatest common divider is " + greatest);
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
