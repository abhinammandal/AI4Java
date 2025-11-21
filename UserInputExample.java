import java.util.Scanner;

/**
 * Write a description of class UserInputExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputExample
{
    public static void main(String[]arg)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the firstNumber");
          int firstValue=sc.nextInt();
          System.out.println("Enter the secondNumber");
          int secondValue=sc.nextInt();
          
                  int bigger=(firstValue>secondValue)?firstValue:secondValue;
           System.out.println("the bigger value from two number is "+bigger);
                  
          
          int sum=firstValue+secondValue;
          System.out.println("the sum of two value "+sum);
    }
}