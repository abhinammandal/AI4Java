package week_03;
import java.util.Scanner;


/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
   public static void main (String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number");
       int firstNumber =sc.nextInt();
       
       System.out.println("Enter the second number");
       int secondNumber =sc.nextInt();
       
         System.out.println("The sum of first number and second number is: " + (firstNumber+secondNumber));
         System.out.println("The substraction of first number and second number is: " + (firstNumber-secondNumber));
         System.out.println("The multiplication of first number and second number is: " + (firstNumber*secondNumber));
         System.out.println("The division of first number and second number is: " + (firstNumber/secondNumber));
         
         float biggernumber = (firstNumber>secondNumber)?firstNumber:secondNumber;
         System.out.println("The bigger number from first number and second number is: " +biggernumber);
       
       
       
       
   }
}