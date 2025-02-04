// Filename: Lab_L51
// Wirtten by Aaron 
// Written on Sep 21 2021
import java.util.Scanner;
public class School
{
   public static void main(String[] args)
   {
      Scanner gradeInput = new Scanner(System.in);
      System.out.println("Please enter your grade >>");
      int grade = gradeInput.nextInt();
            
      if ( grade > 0 && grade < 9 )
       
         {
         System.out.println("You are in elementary school!");
         }
          
         else if ( grade > 8 && grade < 13 )
            
            {     
            System.out.println("You are in HS!");
            }
            
            else 
            
            {
            System.out.println("You are in college!");
            }
   }
}
