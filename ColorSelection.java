// Filename: Exam Question 1
// Wirtten by Aaron Carbonell
// Written on Dec 15 2021
import java.util.Scanner;
public class ColorSelection {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ... ");
		int number = sc.nextInt();
		String color = "";
		
      if (number > 100) { 
         color = "Red";
      }else if (number >= 50 || number <=100) {
         color = "White";
      }else if (number < 50) { 
         color = "Blue";
      }
		// write an if / else if / else block here to
		// set color = "Red" if number is bigger than 100
		//           = "White" if number is between 50 - 100
		//           = "Blue" if number is smaller than 50
		
		System.out.println("Color = " + color);
	}
}