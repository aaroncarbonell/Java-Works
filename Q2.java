import java.util.Scanner;
public class Q2
{
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the temp: ");
   int temp = sc.nextInt();
   if (temp <= 40) {
      System.out.println("It's cold out");
   }
   else {
      System.out.println("Have a nice day");
   
   }
   
   }
}