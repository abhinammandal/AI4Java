package week_03;
import java.util.Scanner;



public class DaysConverter
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter total number of days : ");
        int totaldays = sc.nextInt();
        
        int years = totaldays/365;
        int remainingdays = totaldays%365;
        
        int months = remainingdays/12;
        int days = remainingdays%12;
        
        System.out.println("Years : " + years + "\n" + "Months : " + months + "\n" + "Days : " + days);
        
        
        
    }
}