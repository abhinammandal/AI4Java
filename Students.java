import java.util.Scanner;

/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
        String studentname = sc.nextLine();
        System.out.println("Enter age");
        int age =sc.nextInt();
        System.out.println("Enter GPA");
        float GPA = sc.nextFloat();
        
        System.out.println("-----------Student Details----------");
        System.out.println("Name: " + studentname);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);

        
    }
}