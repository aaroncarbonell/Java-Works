import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{
   public static void main (String[] args)
   {
   int anInt ;
   byte aByte ;
   short aShort ;
   long aLong ;
   
   int anotherInt ;
   
   String name;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Please enter an integer >>");
   anInt = input.nextInt();
   System.out.println("Please enter an byte integer >>");
   aByte = input.nextByte();
   System.out.println("Please enter an short integer >>");
   aShort = input.nextShort();
   System.out.println("Please enter an long integer >>");
   aLong = input.nextLong();
   
   input.nextLine();
   
   System.out.println("Please enter your name >>");
   name = input.nextLine();
   System.out.println("Thank you, " + name);
   
   System.out.println("This int is " + anInt);
   System.out.println("This byte is " + aByte);
   System.out.println("This short is " + aShort);
   System.out.println("This long is " + aLong);

   }
}