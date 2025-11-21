package week_03;
import java.util.Scanner;


public class GradeEvaluator
{
   public static void main (String[]args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter obtained marks");
       int marks = sc.nextInt();
       
       String status = (marks>=40)? "pass": "Fail";
       
       System.out.println(status);
       
       
   }
}