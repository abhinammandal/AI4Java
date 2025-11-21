import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
     public static void main(String[]arg)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first number");
         float firstnumber =sc.nextInt();
         System.out.println("Enter second number");
         float secondnumber =sc.nextFloat();
         
         System.out.println("The sum of first number and second number is: " + (firstnumber+secondnumber));
         System.out.println("The substraction of first number and second number is: " + (firstnumber-secondnumber));
         System.out.println("The multiplication of first number and second number is: " + (firstnumber*secondnumber));
         System.out.println("The division of first number and second number is: " + (firstnumber/secondnumber));
         
         float biggernumber = (firstnumber>secondnumber)?firstnumber:secondnumber;
         System.out.println("The bigger number from first number and second number is: " +biggernumber);
        
         
         
         
         
     }
}