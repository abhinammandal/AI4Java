import java.util.Scanner;

/**
 * Write a description of class WateLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WateLevelMonitor
{
     public static void main(String[]arg)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("What is the water level: ");
          double water_level = sc.nextDouble();
          System.out.println("The water level is: " + water_level);
          
          String status = (water_level>=1000)?"warning: high water level":"Status:normal";
          
          
          System.out.println(status);
          
          
          
     }
}