import java.util.Scanner;
public class Q1
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter a number: ");
      int number = input.nextInt();
      int times2 = number * 2;
      System.out.println(number + " times two is " + times2);

   }
}