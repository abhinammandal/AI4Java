package week_03;
import java.util.Scanner;

public class TimeConverter
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter total seconds : ");
        int totalseconds=sc.nextInt();
        
        int hours = totalseconds/3600;
        int remainingseconds = totalseconds%3600;
        
        int minutes = remainingseconds/60;
        int seconds = remainingseconds%60;
        
        System.out.println("Hours : " + hours + "\n" + "Minutes : " + minutes + "\n" + "seconds : " + seconds);
        
    }
}